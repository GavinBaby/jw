$.extend($.fn.validatebox.defaults.rules, {
    CHS: {
        validator: function (value, param) {
            return /^[\u0391-\uFFE5]+$/.test(value);
        },
        message: '�����뺺��'
    },
    ZIP: {
        validator: function (value, param) {
            return /^[1-9]\d{5}$/.test(value);
        },
        message: '�������벻����'
    },
    QQ: {
        validator: function (value, param) {
            return /^[1-9]\d{4,10}$/.test(value);
        },
        message: 'QQ���벻��ȷ'
    },
    mobile: {
        validator: function (value, param) {
            return /^((\(\d{2,3}\))|(\d{3}\-))?1\d{10}$/.test(value);
        },
        message: '�ֻ����벻��ȷ'
    },
    tel: {
        validator: function (value, param) {    	
            return /^(([0\+]\d{2,3}-)?(0\d{2,3})-)?(\d{7,8})(-(\d{3,}))?$/.test(value);
        },
        message: '�绰���벻��ȷ'
    },
    loginName: {
        validator: function (value, param) {
            return /^[\u0391-\uFFE5\w]+$/.test(value);
        },
        message: '��¼����ֻ�����֡�Ӣ����ĸ�����ּ��»��ߡ�'
    },
    account: {
        validator: function (value, param) {
            return /^[\w]+$/.test(value);
        },
        message: '��¼����ֻ����Ӣ����ĸ�����ּ��»��ߡ�'
    },
    safepass: {
        validator: function (value, param) {
            return safePassword(value);
        },
        message: '��������ĸ��������ɣ�����6λ'
    },
    equalTo: {
        validator: function (value, param) {
            return value == $(param[0]).val();
        },
        message: '����������ַ���һ��'
    },
    number: {
        validator: function (value, param) {
            return /^\d+$/.test(value);
        },
        message: '����������'
    },
    decimal: {
        validator: function (value, param) {
            return /^\d+(\.\d+)?$/.test(value);
        },
        message: '��������ֵ'
    },
    idcard: {
        validator: function (value, param) {
            return IdCard(value);
        },
        message:'��������ȷ�����֤����'
    }
});
 
/* ��������ĸ��������ɣ�����6λ */
var safePassword = function (value) {
    return !(/^(([A-Z]*|[a-z]*|\d*|[-_\~!@#\$%\^&\*\.\(\)\[\]\{\}<>\?\\\/\'\"]*)|.{0,5})$|\s/.test(value));
}