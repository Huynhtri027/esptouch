package com.espressif.iot.esptouch.test;

import com.espressif.iot.esptouch.util.CRC8;

import android.test.AndroidTestCase;

@SuppressWarnings("deprecation")
public class JUnitTest extends AndroidTestCase {

	public void testCRC8() {
		CRC8 crc8 = new CRC8();
		byte[] bytes = new byte[] { 1, 3, 8, 11, -2, -100 };
		crc8.update(bytes);
		assertEquals(83, crc8.getValue());
		
		crc8.reset();
		crc8.update(103);
		crc8.update(-53);
		crc8.update(25);
		assertEquals(73,crc8.getValue());
		
		crc8.reset();
		bytes = new byte[] { 23, -34, 127, -1, 0, 25 };
		crc8.update(bytes, 2, 3);
		assertEquals(49,crc8.getValue());
	}
}
