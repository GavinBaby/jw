package com.jw.magicbpm.common;

import java.util.List;

import javax.annotation.Resource;

import com.jw.baseframe.common.bean.BeanLocator;
import com.jw.baseframe.util.StringTools;
import com.jw.magicbpm.dao.documentmanagement.B_T_Ufp_FavoritesMapper;
import com.jw.magicbpm.dao.documentmanagement.B_T_Ufp_FilesBaseMapper;
import com.jw.magicbpm.model.documentmanagement.B_T_Ufp_Favorites;
import com.jw.magicbpm.model.documentmanagement.B_T_Ufp_FavoritesExample;
import com.jw.magicbpm.model.documentmanagement.B_T_Ufp_FilesBase;
import com.jw.magicbpm.model.documentmanagement.B_T_Ufp_FilesBaseExample;

/**
 * 通用方法类
 * @author pandb 2013-5-27
 *
 */
public class CommonOperation {
	
	private static B_T_Ufp_FavoritesMapper mapperFT =(B_T_Ufp_FavoritesMapper)BeanLocator.getService("b_T_Ufp_FavoritesMapper") ;
	private static B_T_Ufp_FilesBaseMapper mapperFBT =(B_T_Ufp_FilesBaseMapper)BeanLocator.getService("b_T_Ufp_FilesBaseMapper");
	
	/**
	 * 收发文同时删除公文收藏夹和公文库文件
	 */
	public static void deleteFavAndBase(String ids,boolean isLogicDel){

		B_T_Ufp_FavoritesExample exampleFT = new B_T_Ufp_FavoritesExample();
		B_T_Ufp_FilesBaseExample exampleFBT = new B_T_Ufp_FilesBaseExample();
		if (StringTools.isNotNullAndHasValue(ids)) {
			String temp[] = ids.split(",");
			for (String id : temp) {
				exampleFT.or().andMaindocIdEqualTo(id);
				exampleFBT.or().andDocumentbaseIdEqualTo(id);
			}
			if(isLogicDel){
				List<B_T_Ufp_Favorites> listrecordFT;
				List<B_T_Ufp_FilesBase> listrecorFBT;
				for (int i = 0; i < temp.length; i++) {
					exampleFT.clear();
					exampleFBT.clear();
					exampleFT.or().andMaindocIdEqualTo(temp[i]);
					exampleFBT.or().andDocumentbaseIdEqualTo(temp[i]);
					listrecordFT = mapperFT.selectByExample(exampleFT);
					listrecorFBT = mapperFBT.selectByExample(exampleFBT);
					for (B_T_Ufp_Favorites recordFT : listrecordFT) {
						recordFT.setIsDelete(1);
						mapperFT.updateByPrimaryKeySelective(recordFT);
					}
					for (B_T_Ufp_FilesBase recordFBT : listrecorFBT) {
						recordFBT.setIsDelete(1);
						mapperFBT.updateByPrimaryKeySelective(recordFBT);
					}
				}
			}else{
				mapperFT.deleteByExample(exampleFT);
				mapperFBT.deleteByExample(exampleFBT);
			}
		}
	}
	//2015-10-12 修改：尤    
	//收藏夹保存
	public static void saveFavorites(B_T_Ufp_Favorites b_T_Ufp_Favorites,
			String favoritesUserid, String favoritesUsernm, String Mark,
			String favoritesTime, String url,String mainDocId,String favoritesTitle,String favoriteFileType,
			String Wenhao) throws Exception {
		b_T_Ufp_Favorites.setFavoritesUserid(favoritesUserid);
		b_T_Ufp_Favorites.setFavoritesUsernm(favoritesUsernm);
		b_T_Ufp_Favorites.setFavoritesMark(Mark);
		b_T_Ufp_Favorites.setFavoritesTime(favoritesTime);
		b_T_Ufp_Favorites.setFavoritesUrl(url);
		b_T_Ufp_Favorites.setMaindocId(mainDocId);
		b_T_Ufp_Favorites.setFavoritesTitle(favoritesTitle);
		b_T_Ufp_Favorites.setFavoritesTypeid(favoriteFileType);
		b_T_Ufp_Favorites.setFavoritesWenhao(Wenhao);
	}
	
	
}
