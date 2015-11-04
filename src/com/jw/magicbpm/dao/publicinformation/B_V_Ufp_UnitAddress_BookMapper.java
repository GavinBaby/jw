package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_V_Ufp_UnitAddress_Book;
import com.jw.magicbpm.model.publicinformation.B_V_Ufp_UnitAddress_BookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_V_Ufp_UnitAddress_BookMapper {
    int countByExample(@Param("example") B_V_Ufp_UnitAddress_BookExample example);

    int deleteByExample(@Param("example") B_V_Ufp_UnitAddress_BookExample example);

    int insert(@Param("record") B_V_Ufp_UnitAddress_Book record);

    int insertSelective(@Param("record") B_V_Ufp_UnitAddress_Book record);

    List<B_V_Ufp_UnitAddress_Book> selectByExample(@Param("example") B_V_Ufp_UnitAddress_BookExample example);

    int updateByExampleSelective(@Param("record") B_V_Ufp_UnitAddress_Book record, @Param("example") B_V_Ufp_UnitAddress_BookExample example);

    int updateByExample(@Param("record") B_V_Ufp_UnitAddress_Book record, @Param("example") B_V_Ufp_UnitAddress_BookExample example);
}