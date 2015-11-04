package com.jw.magicbpm.dao.publicinformation;

import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Memos;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_MemosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B_T_Ufp_MemosMapper {
    int countByExample(@Param("example") B_T_Ufp_MemosExample example);

    int deleteByExample(@Param("example") B_T_Ufp_MemosExample example);

    int deleteByPrimaryKey(@Param("uuid") String uuid);

    int insert(@Param("record") B_T_Ufp_Memos record);

    int insertSelective(@Param("record") B_T_Ufp_Memos record);

    List<B_T_Ufp_Memos> selectByExample(@Param("example") B_T_Ufp_MemosExample example);

    B_T_Ufp_Memos selectByPrimaryKey(@Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") B_T_Ufp_Memos record, @Param("example") B_T_Ufp_MemosExample example);

    int updateByExample(@Param("record") B_T_Ufp_Memos record, @Param("example") B_T_Ufp_MemosExample example);

    int updateByPrimaryKeySelective(@Param("record") B_T_Ufp_Memos record);

    int updateByPrimaryKey(@Param("record") B_T_Ufp_Memos record);
}