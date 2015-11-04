package com.jw.baseframe.util;

import java.util.Random;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
/**
 * 
  * <b>Summary: </b>
  *      TODO 请在此处简要描述此类所实现的功能。因为这项注释主要是为了在IDE环境中生成tip帮助，务必简明扼要
  * <b>Remarks: </b>
  *        DES des = new DES();
String aa = des.encrypt("123","$Jwpwd888");
String aa1 = des.decrypt(aa,"$Jwpwd888");


System.out.println("des="+aa);
System.out.println("des1="+aa1);
 */
public class DES {

    static final int S11 = 7;
    static final int S12 = 12;
    static final int S13 = 17;
    static final int S14 = 22;
    static final int S21 = 5;
    static final int S22 = 9;
    static final int S23 = 14;
    static final int S24 = 20;
    static final int S31 = 4;
    static final int S32 = 11;
    static final int S33 = 16;
    static final int S34 = 23;
    static final int S41 = 6;
    static final int S42 = 10;
    static final int S43 = 15;
    static final int S44 = 21;
    static final byte PADDING[] = {
        -128, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
        0, 0, 0, 0
    };
    private long state[];
    private long count[];
    private byte buffer[];
    public String digestHexStr;
    private byte digest[];
    public String key="@@@";

    public String getMD5ofStr(String inbuf)
    {
        md5Init();
        md5Update(inbuf.getBytes(), inbuf.length());
        md5Final();
        digestHexStr = "";
        for(int i = 0; i < 16; i++)
            digestHexStr += byteHEX(digest[i]);

        return digestHexStr;
    }

    public DES()
    {
        state = new long[4];
        count = new long[2];
        buffer = new byte[64];
        digest = new byte[16];
        md5Init();
    }

    private void md5Init()
    {
        count[0] = 0L;
        count[1] = 0L;
        state[0] = 0x67452301L;
        state[1] = 0xefcdab89L;
        state[2] = 0x98badcfeL;
        state[3] = 0x10325476L;
    }

    private long F(long x, long y, long z)
    {
        return x & y | ~x & z;
    }

    private long G(long x, long y, long z)
    {
        return x & z | y & ~z;
    }

    private long H(long x, long y, long z)
    {
        return x ^ y ^ z;
    }

    private long I(long x, long y, long z)
    {
        return y ^ (x | ~z);
    }

    private long FF(long a, long b, long c, long d, long x, long s, long ac)
    {
        a += F(b, c, d) + x + ac;
        a = (int)a << (int)s | (int)a >>> (int)(32L - s);
        a += b;
        return a;
    }

    private long GG(long a, long b, long c, long d, long x, long s, long ac)
    {
        a += G(b, c, d) + x + ac;
        a = (int)a << (int)s | (int)a >>> (int)(32L - s);
        a += b;
        return a;
    }

    private long HH(long a, long b, long c, long d, long x, long s, long ac)
    {
        a += H(b, c, d) + x + ac;
        a = (int)a << (int)s | (int)a >>> (int)(32L - s);
        a += b;
        return a;
    }

    private long II(long a, long b, long c, long d, long x, long s, long ac)
    {
        a += I(b, c, d) + x + ac;
        a = (int)a << (int)s | (int)a >>> (int)(32L - s);
        a += b;
        return a;
    }

    private void md5Update(byte inbuf[], int inputLen)
    {
        byte block[] = new byte[64];
        int index = (int)(count[0] >>> 3) & 0x3f;
        if((count[0] += inputLen << 3) < (long)(inputLen << 3))
            count[1]++;
        count[1] += inputLen >>> 29;
        int partLen = 64 - index;
        int i;
        if(inputLen >= partLen)
        {
            md5Memcpy(buffer, inbuf, index, 0, partLen);
            md5Transform(buffer);
            for(i = partLen; i + 63 < inputLen; i += 64)
            {
                md5Memcpy(block, inbuf, 0, i, 64);
                md5Transform(block);
            }

            index = 0;
        } else
        {
            i = 0;
        }
        md5Memcpy(buffer, inbuf, index, i, inputLen - i);
    }

    private void md5Final()
    {
        byte bits[] = new byte[8];
        Encode(bits, count, 8);
        int index = (int)(count[0] >>> 3) & 0x3f;
        int padLen = index >= 56 ? 120 - index : 56 - index;
        md5Update(PADDING, padLen);
        md5Update(bits, 8);
        Encode(digest, state, 16);
    }

    private void md5Memcpy(byte output[], byte input[], int outpos, int inpos, int len)
    {
        for(int i = 0; i < len; i++)
            output[outpos + i] = input[inpos + i];

    }

    private void md5Transform(byte block[])
    {
        long a = state[0];
        long b = state[1];
        long c = state[2];
        long d = state[3];
        long x[] = new long[16];
        Decode(x, block, 64);
        a = FF(a, b, c, d, x[0], 7L, 0xd76aa478L);
        d = FF(d, a, b, c, x[1], 12L, 0xe8c7b756L);
        c = FF(c, d, a, b, x[2], 17L, 0x242070dbL);
        b = FF(b, c, d, a, x[3], 22L, 0xc1bdceeeL);
        a = FF(a, b, c, d, x[4], 7L, 0xf57c0fafL);
        d = FF(d, a, b, c, x[5], 12L, 0x4787c62aL);
        c = FF(c, d, a, b, x[6], 17L, 0xa8304613L);
        b = FF(b, c, d, a, x[7], 22L, 0xfd469501L);
        a = FF(a, b, c, d, x[8], 7L, 0x698098d8L);
        d = FF(d, a, b, c, x[9], 12L, 0x8b44f7afL);
        c = FF(c, d, a, b, x[10], 17L, 0xffff5bb1L);
        b = FF(b, c, d, a, x[11], 22L, 0x895cd7beL);
        a = FF(a, b, c, d, x[12], 7L, 0x6b901122L);
        d = FF(d, a, b, c, x[13], 12L, 0xfd987193L);
        c = FF(c, d, a, b, x[14], 17L, 0xa679438eL);
        b = FF(b, c, d, a, x[15], 22L, 0x49b40821L);
        a = GG(a, b, c, d, x[1], 5L, 0xf61e2562L);
        d = GG(d, a, b, c, x[6], 9L, 0xc040b340L);
        c = GG(c, d, a, b, x[11], 14L, 0x265e5a51L);
        b = GG(b, c, d, a, x[0], 20L, 0xe9b6c7aaL);
        a = GG(a, b, c, d, x[5], 5L, 0xd62f105dL);
        d = GG(d, a, b, c, x[10], 9L, 0x2441453L);
        c = GG(c, d, a, b, x[15], 14L, 0xd8a1e681L);
        b = GG(b, c, d, a, x[4], 20L, 0xe7d3fbc8L);
        a = GG(a, b, c, d, x[9], 5L, 0x21e1cde6L);
        d = GG(d, a, b, c, x[14], 9L, 0xc33707d6L);
        c = GG(c, d, a, b, x[3], 14L, 0xf4d50d87L);
        b = GG(b, c, d, a, x[8], 20L, 0x455a14edL);
        a = GG(a, b, c, d, x[13], 5L, 0xa9e3e905L);
        d = GG(d, a, b, c, x[2], 9L, 0xfcefa3f8L);
        c = GG(c, d, a, b, x[7], 14L, 0x676f02d9L);
        b = GG(b, c, d, a, x[12], 20L, 0x8d2a4c8aL);
        a = HH(a, b, c, d, x[5], 4L, 0xfffa3942L);
        d = HH(d, a, b, c, x[8], 11L, 0x8771f681L);
        c = HH(c, d, a, b, x[11], 16L, 0x6d9d6122L);
        b = HH(b, c, d, a, x[14], 23L, 0xfde5380cL);
        a = HH(a, b, c, d, x[1], 4L, 0xa4beea44L);
        d = HH(d, a, b, c, x[4], 11L, 0x4bdecfa9L);
        c = HH(c, d, a, b, x[7], 16L, 0xf6bb4b60L);
        b = HH(b, c, d, a, x[10], 23L, 0xbebfbc70L);
        a = HH(a, b, c, d, x[13], 4L, 0x289b7ec6L);
        d = HH(d, a, b, c, x[0], 11L, 0xeaa127faL);
        c = HH(c, d, a, b, x[3], 16L, 0xd4ef3085L);
        b = HH(b, c, d, a, x[6], 23L, 0x4881d05L);
        a = HH(a, b, c, d, x[9], 4L, 0xd9d4d039L);
        d = HH(d, a, b, c, x[12], 11L, 0xe6db99e5L);
        c = HH(c, d, a, b, x[15], 16L, 0x1fa27cf8L);
        b = HH(b, c, d, a, x[2], 23L, 0xc4ac5665L);
        a = II(a, b, c, d, x[0], 6L, 0xf4292244L);
        d = II(d, a, b, c, x[7], 10L, 0x432aff97L);
        c = II(c, d, a, b, x[14], 15L, 0xab9423a7L);
        b = II(b, c, d, a, x[5], 21L, 0xfc93a039L);
        a = II(a, b, c, d, x[12], 6L, 0x655b59c3L);
        d = II(d, a, b, c, x[3], 10L, 0x8f0ccc92L);
        c = II(c, d, a, b, x[10], 15L, 0xffeff47dL);
        b = II(b, c, d, a, x[1], 21L, 0x85845dd1L);
        a = II(a, b, c, d, x[8], 6L, 0x6fa87e4fL);
        d = II(d, a, b, c, x[15], 10L, 0xfe2ce6e0L);
        c = II(c, d, a, b, x[6], 15L, 0xa3014314L);
        b = II(b, c, d, a, x[13], 21L, 0x4e0811a1L);
        a = II(a, b, c, d, x[4], 6L, 0xf7537e82L);
        d = II(d, a, b, c, x[11], 10L, 0xbd3af235L);
        c = II(c, d, a, b, x[2], 15L, 0x2ad7d2bbL);
        b = II(b, c, d, a, x[9], 21L, 0xeb86d391L);
        state[0] += a;
        state[1] += b;
        state[2] += c;
        state[3] += d;
    }

    private void Encode(byte output[], long input[], int len)
    {
        int i = 0;
        for(int j = 0; j < len; j += 4)
        {
            output[j] = (byte)(int)(input[i] & 255L);
            output[j + 1] = (byte)(int)(input[i] >>> 8 & 255L);
            output[j + 2] = (byte)(int)(input[i] >>> 16 & 255L);
            output[j + 3] = (byte)(int)(input[i] >>> 24 & 255L);
            i++;
        }

    }

    private void Decode(long output[], byte input[], int len)
    {
        int i = 0;
        for(int j = 0; j < len; j += 4)
        {
            output[i] = b2iu(input[j]) | b2iu(input[j + 1]) << 8 | b2iu(input[j + 2]) << 16 | b2iu(input[j + 3]) << 24;
            i++;
        }

    }

    public static long b2iu(byte b)
    {
        return (long)(b >= 0 ? b : b & 0xff);
    }

    public static String byteHEX(byte ib)
    {
        char Digit[] = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
            'A', 'B', 'C', 'D', 'E', 'F'
        };
        char ob[] = new char[2];
        ob[0] = Digit[ib >>> 4 & 0xf];
        ob[1] = Digit[ib & 0xf];
        String s = new String(ob);
        return s;
    }

    public String getKeyEd(String Txt, String encrypt_key)
    {
        if(Txt.length() == 0 || Txt == null)
            Txt = "";
        encrypt_key = getMD5ofStr(encrypt_key);
        int m = 0;
        int n = encrypt_key.length();
        StringBuffer temp = new StringBuffer();
        for(int i = 0; i < Txt.length(); i++)
        {
            if(m == n)
                m = 0;
            char cc1 = encrypt_key.charAt(m);
            int cc4 = cc1 ^ Txt.charAt(i);
            char cc2 = (char)cc4;
            temp.append(cc2);
            m++;
        }

        return String.valueOf(temp.toString());
    }

    public String encrypt(String Txt, String Key1)
    {
        int number = getRandom();
        String encrypt_key = getMD5ofStr(Integer.toString(number));
        int ctr = 0;
        int num = Txt.length();
        int num1 = encrypt_key.length();
        Txt = Txt.trim();
        StringBuffer temp = new StringBuffer();
        for(int i = 0; i < num; i++)
        {
            if(ctr == num1)
                ctr = 0;
            char cc1 = encrypt_key.charAt(ctr);
            temp.append(cc1);
            char cc2 = Txt.charAt(i);
            int cc4 = cc1 ^ cc2;
            char cc3 = (char)cc4;
            temp.append(cc3);
            ctr++;
        }

        String er = temp.toString();
        String retur = getKeyEd(er, Key1);
        retur = setFromBASE64(retur);
        return retur;
    }

    public String decrypt(String Txt, String Key1)
    {
        Txt = getFromBASE64(Txt);
        Txt = getKeyEd(Txt, Key1);
        StringBuffer temp = new StringBuffer();
        char temp1 = '\0';
        for(int i = 0; i < Txt.length(); i++)
        {
            temp1 = Txt.charAt(i);
            i++;
            char cc1 = Txt.charAt(i);
            int cc2 = cc1 ^ temp1;
            char cc3 = (char)cc2;
            temp = temp.append(cc3);
        }

        Txt = temp.toString();
        return Txt;
    }

    public String getFromBASE64(String s)
    {
        BASE64Decoder decoder;
        if(s == null || s.length() <= 0)
            return "";
        decoder = new BASE64Decoder();
        byte b[];
		try {
			b = decoder.decodeBuffer(s);
			return new String(b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}
        
        //Exception e;
        //e;
        //return "";
    }

    public String setFromBASE64(String s)
    {
        BASE64Encoder encoder;
        if(s == null || s.length() <= 0)
            return "";
        encoder = new BASE64Encoder();
        String b = encoder.encodeBuffer(s.getBytes());
        return b;
        //Exception e;
        //e;
        //return "";
    }

    public String getDecTxtChange(String Txt)
    {
        int n = Txt.length();
        int num = 0;
        String tem1 = "";
        String tem2 = "";
        if(n % 2 == 0)
            num = n / 2;
        else
            num = (n + 1) / 2;
        tem1 = Txt.substring(0, num);
        tem2 = Txt.substring(num, n);
        StringBuffer temp1 = new StringBuffer(tem1);
        StringBuffer temp2 = new StringBuffer(tem2);
        StringBuffer temp3 = new StringBuffer();
        temp1 = temp1.reverse();
        temp2 = temp2.reverse();
        for(int i = 0; i < num; i++)
        {
            char tem = decAscChange(temp1.charAt(i));
            temp3.append(tem);
            if(n % 2 == 0)
            {
                char temm = decAscChange(temp2.charAt(i));
                temp3.append(temm);
            } else
            if(i < num - 1)
            {
                char temm = decAscChange(temp2.charAt(i));
                temp3.append(temm);
            }
        }

        return temp3.toString();
    }

    public char decAscChange(char ib)
    {
        int num = ib;
        String num1 = Integer.toBinaryString(num);
        StringBuffer temp1 = new StringBuffer();
        String ll = "";
        int n = num1.length();
        int k = 8 - n;
        if(k > 0)
        {
            for(int i = 0; i < k; i++)
                temp1 = temp1.append("0");

        }
        ll = temp1.toString();
        ll = ll + num1;
        StringBuffer temp7 = new StringBuffer();
        for(int i = 0; i < 4; i++)
            temp7 = temp7.append(ll.charAt(2 * i));

        for(int i = 4; i > 0; i--)
            temp7 = temp7.append(ll.charAt(2 * i - 1));

        String lll = temp7.toString();
        char er[] = lll.toCharArray();
        int sum = 7;
        int sum1 = 0;
        for(int j = 0; j < 8; j++)
        {
            char k1 = er[j];
            int k7 = k1;
            if(k7 == 49)
            {
                double num12 = Math.pow(2D, sum);
                sum1 += (int)num12;
            }
            sum--;
        }

        char k22 = (char)sum1;
        return k22;
    }

    public String getTxtChang(String Txt)
    {
        StringBuffer temp1 = new StringBuffer();
        StringBuffer temp2 = new StringBuffer();
        for(int i = 0; i < Txt.length(); i++)
            if(i % 2 == 0)
            {
                char tem = getByteDEX(Txt.charAt(i));
                temp1 = temp1.append(tem);
            } else
            {
                char tem1 = getByteDEX(Txt.charAt(i));
                temp2 = temp2.append(tem1);
            }

        temp1 = temp1.reverse();
        temp2 = temp2.reverse();
        temp1.append(temp2);
        return String.valueOf(temp1.toString());
    }

    public char getByteDEX(char ib)
    {
        int num = ib;
        String num1 = Integer.toBinaryString(num);
        StringBuffer temp1 = new StringBuffer();
        int n = num1.length();
        int k = 8 - n;
        String ll = "";
        if(k > 0)
        {
            for(int i = 0; i < k; i++)
                temp1 = temp1.append("0");

            ll = temp1.toString();
            ll = ll + num1;
        }
        StringBuffer temp7 = new StringBuffer();
        k = 7;
        for(int i = 0; i < 4; i++)
        {
            temp7 = temp7.append(ll.charAt(i));
            temp7 = temp7.append(ll.charAt(k--));
        }

        String lll = temp7.toString();
        char er[] = lll.toCharArray();
        int sum = 7;
        int sum1 = 0;
        for(int j = 0; j < 8; j++)
        {
            char k1 = er[j];
            int k7 = k1;
            if(k7 == 49)
            {
                double num12 = Math.pow(2D, sum);
                sum1 += (int)num12;
            }
            sum--;
        }

        char k22 = (char)sum1;
        return k22;
    }

    public int getRandom()
    {
        Random generator = new Random();
        int limit = 0x4e200;
        int randomNub = 1;
        boolean j = true;
        while(j) 
        {
            randomNub = (int)(generator.nextDouble() * (double)limit);
            if(randomNub > 10)
                j = false;
        }
        return randomNub;
    }
    
}
