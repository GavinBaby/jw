package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Address_Book;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Address_BookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Ufp_Address_BookMapper {
    int countByExample(@Param("example") B_T_Ufp_Address_BookExample example);

    int deleteByExample(@Param("example") B_T_Ufp_Address_BookExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Ufp_Address_Book record);

    int insertSelective(@Param("record") B_T_Ufp_Address_Book record);

    List<B_T_Ufp_Address_Book> selectByExample(@Param("example") B_T_Ufp_Address_BookExample example);

    B_T_Ufp_Address_Book selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Ufp_Address_Book record, @Param("example") B_T_Ufp_Address_BookExample example);

    int updateByExample(@Param("record") B_T_Ufp_Address_Book record, @Param("example") B_T_Ufp_Address_BookExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Ufp_Address_Book record);

    int updateByPrimaryKey(@Param("record") B_T_Ufp_Address_Book record);
}