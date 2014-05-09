package repositories;

import java.util.List;

/**
 * データアクセス用のインタフェース
 * @author 1
 *
 * @param <TKey>エンティティのキー
 * @param <TEntity>エンティティ
 */
public interface IRepository<TKey, TEntity> {

	/**
	 * キー情報をもとに検索
	 * @param key キー情報
	 * @return　検索結果
	 */
	public TEntity findByKey(TKey key);
	
	/**
	 * エンティティを全て返却
	 * @return エンティティのリスト
	 */
	public List<TEntity> findAll();
	
	/**
	 * エンティティを追加
	 * @param entity　追加するエンティティ
	 */
	public void add(TEntity entity);
	
	/**
	 * キーに対応するエンティティを削除
	 * @param key 削除するエンティティのキー情報
	 */
	public void deleteByKey(TKey key);
}
