package model;

import java.util.List;

/**
 * カート情報を表すクラス
 */
public class Cart {
	/******** フィールド ******************************************/
	/**
	 * ユーザーID
	 */
	private String userId;

	/**
	 * カート内の商品リスト
	 */
	private List<Product> listProd;

	/******** コンストラクタ **************************************/
	/**
	 * フィールド初期化コンストラクタ
	 * @param userId
	 * @param listProd
	 */
	public Cart(String userId, List<Product> listProd) {
		this.userId = userId;
		this.listProd = listProd;
	}

	/******** メソッド ******************************************/
	/*--------------------getter/setter--------------------*/
	/**
	 * @return userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @return listItem
	 */
	public List<Product> getListProd() {
		return listProd;
	}

	/*--------------------通常メソッド--------------------*/
	/**
	 * カートに商品を追加する
	 * @param prod 追加する商品
	 */
	public void add(Product prod) {
		listProd.add(prod);
	}
}
