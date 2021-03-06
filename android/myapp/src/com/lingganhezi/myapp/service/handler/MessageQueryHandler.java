package com.lingganhezi.myapp.service.handler;

import com.lingganhezi.myapp.service.MessageService;
import android.database.Cursor;
import android.os.Message;

public class MessageQueryHandler extends BaseServiceHandler<Cursor> {

	/**
	 * 
	 * @param callback
	 *            Cursor类型，代表 message 所在的游标
	 */
	public MessageQueryHandler(Callback<Cursor> callback) {
		super();
		mCallback = callback;
	}

	@Override
	public void handleMessage(Message msg) {
		switch (msg.what) {
		case MessageService.MSG_QUERY_MESSAGE_SUCCESS:
			callCallback(msg, true);
			break;
		default:
			callCallback(msg, false);
			break;
		}

		super.handleMessage(msg);
	}

}
