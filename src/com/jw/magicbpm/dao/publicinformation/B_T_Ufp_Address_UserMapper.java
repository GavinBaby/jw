package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Address_User;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Address_UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Ufp_Address_UserMapper {
    int countByExample(@Param("example") B_T_Ufp_Address_UserExample example);

    int deleteByExample(@Param("example") B_T_Ufp_Address_UserExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Ufp_Address_User record);

    int insertSelective(@Param("record") B_T_Ufp_Address_User record);

    List<B_T_Ufp_Address_User> selectByExample(@Param("example") B_T_Ufp_Address_UserExample example);

    B_T_Ufp_Address_User selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Ufp_Address_User record, @Param("example") B_T_Ufp_Address_UserExample example);

    int updateByExample(@Param("record") B_T_Ufp_Address_User record, @Param("example") B_T_Ufp_Address_UserExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Ufp_Address_User record);

    int updateByPrimaryKey(@Param("record") B_T_Ufp_Address_User record);
}