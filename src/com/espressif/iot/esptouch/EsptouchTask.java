package com.espressif.iot.esptouch;

import java.util.List;

import android.content.Context;

public class EsptouchTask implements IEsptouchTask {

	/**
	 * Constructor of EsptouchTask
	 * 
	 * @param apSsid
	 *            the Ap's ssid
	 * @param apBssid
	 *            the Ap's bssid
	 * @param apPassword
	 *            the Ap's password
	 * @param isSsidHidden
	 *            whether the Ap's ssid is hidden
	 * @param context
	 *            the Context of the Application
	 */
	public EsptouchTask(String apSsid, String apBssid, String apPassword,
			boolean isSsidHidden, Context context) {
		throw new RuntimeException("Don't support at present!!!");
	}

	/**
	 * Constructor of EsptouchTask
	 * 
	 * @param apSsid
	 *            the Ap's ssid
	 * @param apBssid
	 *            the Ap's bssid
	 * @param apPassword
	 *            the Ap's password
	 * @param isSsidHidden
	 *            whether the Ap's ssid is hidden
	 * @param timeoutMillisecond
	 *            (it should be >= 15000+6000) millisecond of total timeout
	 * @param context
	 *            the Context of the Application
	 */
	public EsptouchTask(String apSsid, String apBssid, String apPassword,
			boolean isSsidHidden, int timeoutMillisecond, Context context) {
		throw new RuntimeException("Don't support at present!!!");
	}

	@Override
	public void interrupt() {
		throw new RuntimeException("Don't support at present!!!");
	}

	@Override
	public IEsptouchResult executeForResult() throws RuntimeException {
		throw new RuntimeException("Don't support at present!!!");
	}

	@Override
	public boolean isCancelled() {
		throw new RuntimeException("Don't support at present!!!");
	}

	@Override
	public List<IEsptouchResult> executeForResults(int expectTaskResultCount)
			throws RuntimeException {
		throw new RuntimeException("Don't support at present!!!");
	}

	@Override
	public void setEsptouchListener(IEsptouchListener esptouchListener) {
		throw new RuntimeException("Don't support at present!!!");
	}
}
