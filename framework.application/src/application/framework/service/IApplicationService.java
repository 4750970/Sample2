package application.framework.service;

import exception.ApplicationException;

/**
 * アプリケーションサービスのインタフェース
 * @author 1
 *
 * @param <S>入力データクラス
 * @param <T>出力データクラス
 */
public interface IApplicationService<S, T> {
	
	/**
	 * アプリケーションサービスの処理を実行する
	 * @param input 入力データ
	 * @return 出力データ
	 */
	T execute(S input) throws ApplicationException;
}
