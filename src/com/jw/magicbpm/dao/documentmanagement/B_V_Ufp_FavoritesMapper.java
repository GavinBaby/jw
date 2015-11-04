package com.jw.magicbpm.dao.documentmanagement;

import com.jw.magicbpm.model.documentmanagement.B_V_Ufp_Favorites;
import com.jw.magicbpm.model.documentmanagement.B_V_Ufp_FavoritesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_V_Ufp_FavoritesMapper {
    int countByExample(@Param("example") B_V_Ufp_FavoritesExample example);

    int deleteByExample(@Param("example") B_V_Ufp_FavoritesExample example);

    int insert(@Param("record") B_V_Ufp_Favorites record);

    int insertSelective(@Param("record") B_V_Ufp_Favorites record);

    List<B_V_Ufp_Favorites> selectByExample(@Param("example") B_V_Ufp_FavoritesExample example);

    int updateByExampleSelective(@Param("record") B_V_Ufp_Favorites record, @Param("example") B_V_Ufp_FavoritesExample example);

    int updateByExample(@Param("record") B_V_Ufp_Favorites record, @Param("example") B_V_Ufp_FavoritesExample example);
}