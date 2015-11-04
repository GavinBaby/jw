package com.jw.magicbpm.dao.documentmanagement;

import com.jw.magicbpm.model.documentmanagement.B_T_Ufp_Favorites;
import com.jw.magicbpm.model.documentmanagement.B_T_Ufp_FavoritesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Ufp_FavoritesMapper {
    int countByExample(@Param("example") B_T_Ufp_FavoritesExample example);

    int deleteByExample(@Param("example") B_T_Ufp_FavoritesExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Ufp_Favorites record);

    int insertSelective(@Param("record") B_T_Ufp_Favorites record);

    List<B_T_Ufp_Favorites> selectByExample(@Param("example") B_T_Ufp_FavoritesExample example);

    B_T_Ufp_Favorites selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Ufp_Favorites record, @Param("example") B_T_Ufp_FavoritesExample example);

    int updateByExample(@Param("record") B_T_Ufp_Favorites record, @Param("example") B_T_Ufp_FavoritesExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Ufp_Favorites record);

    int updateByPrimaryKey(@Param("record") B_T_Ufp_Favorites record);
}