/*
 * Copyright 2011-2014 the original author or authors.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.blu3f1re.reddwallet;

import java.io.File;
import java.nio.charset.Charset;

import android.os.Build;
import android.os.Environment;
import android.text.format.DateUtils;

import com.google.reddcoin.core.NetworkParameters;
import com.google.reddcoin.params.MainNetParams;
import com.google.reddcoin.params.TestNet3Params;

/**
 * @author Andreas Schildbach
 */
public class Constants
{
	public static final boolean TEST = R.class.getPackage().getName().contains("_test");

	public static final NetworkParameters NETWORK_PARAMETERS = TEST ? TestNet3Params.get() : MainNetParams.get();
	private static final String FILENAME_NETWORK_SUFFIX = NETWORK_PARAMETERS.getId().equals(NetworkParameters.ID_MAINNET) ? "" : "-testnet";

	public static final String WALLET_FILENAME = "wallet" + FILENAME_NETWORK_SUFFIX;

	public static final String WALLET_FILENAME_PROTOBUF = "wallet-protobuf" + FILENAME_NETWORK_SUFFIX;
	
	public static final String WALLET_KEY_BACKUP_PROTOBUF = "key-backup-protobuf" + FILENAME_NETWORK_SUFFIX;

	public static final String WALLET_KEY_BACKUP_BASE58 = "key-backup-base58" + FILENAME_NETWORK_SUFFIX;

	public static final File EXTERNAL_WALLET_BACKUP_DIR = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
	public static final String EXTERNAL_WALLET_KEY_BACKUP = "reddcoin-wallet-keys" + FILENAME_NETWORK_SUFFIX;

	public static final String BLOCKCHAIN_FILENAME = "blockchain" + FILENAME_NETWORK_SUFFIX;

	public static final String CHECKPOINTS_FILENAME = "checkpoints" + FILENAME_NETWORK_SUFFIX;
	
	
	private static final String BLOCKEXPLORER_BASE_URL_PROD = "http://blockexplorer.reddcoin.com/";
	private static final String BLOCKEXPLORER_BASE_URL_TEST = "http://blockexplorer.reddcoin.com/testnet/"; //RDD: Not yet...
	public static final String BLOCKEXPLORER_BASE_URL = NETWORK_PARAMETERS.getId().equals(NetworkParameters.ID_MAINNET) ? BLOCKEXPLORER_BASE_URL_PROD
			: BLOCKEXPLORER_BASE_URL_TEST;

	public static final String MIMETYPE_PAYMENTREQUEST = "application/reddcoin-paymentrequest"; // BIP 71
	public static final String MIMETYPE_PAYMENT = "application/reddcoin-payment"; // BIP 71
	public static final String MIMETYPE_PAYMENTACK = "application/reddcoin-paymentack"; // BIP 71
	public static final String MIMETYPE_TRANSACTION = "application/x-reddtx";
	public static final String MIMETYPE_BACKUP_PRIVATE_KEYS = "x-reddcoin/private-keys";
	

	public static final int MAX_NUM_CONFIRMATIONS = 3;
	public static final String USER_AGENT = "Reddcoin Wallet";
	public static final String DEFAULT_EXCHANGE_CURRENCY = "USD";
	public static final int WALLET_OPERATION_STACK_SIZE = 256 * 1024;
	public static final long BLOCKCHAIN_STATE_BROADCAST_THROTTLE_MS = DateUtils.SECOND_IN_MILLIS;
	public static final long BLOCKCHAIN_UPTODATE_THRESHOLD_MS = DateUtils.HOUR_IN_MILLIS;

	public static final String CURRENCY_CODE_BTC = "RDD";
	public static final String CURRENCY_CODE_MBTC = "mRDD";
	public static final String CURRENCY_CODE_UBTC = "µRDD";
	public static final char CHAR_HAIR_SPACE = '\u200a';
	public static final char CHAR_THIN_SPACE = '\u2009';
	public static final char CHAR_ALMOST_EQUAL_TO = '\u2248';
	public static final char CHAR_CHECKMARK = '\u2713';
	public static final String CURRENCY_PLUS_SIGN = "+" + CHAR_THIN_SPACE;
	public static final String CURRENCY_MINUS_SIGN = "-" + CHAR_THIN_SPACE;
	public static final String PREFIX_ALMOST_EQUAL_TO = Character.toString(CHAR_ALMOST_EQUAL_TO) + CHAR_THIN_SPACE;
	public static final int ADDRESS_FORMAT_GROUP_SIZE = 4;
	public static final int ADDRESS_FORMAT_LINE_SIZE = 12;

	public static final int BTC_MAX_PRECISION = 8;
	public static final int MBTC_MAX_PRECISION = 5;
	public static final int UBTC_MAX_PRECISION = 2;
	public static final int LOCAL_PRECISION = 4;
	
	public static final String DONATION_ADDRESS = "RZmXzfyiB2LVBFLQwWtgcBs1y2kqnpDkxo";
	public static final String REPORT_EMAIL = "reddcoinandroid@blu3f1re.com";
	
	public static final String REPORT_SUBJECT_ISSUE = "Reported issue";
	public static final String REPORT_SUBJECT_CRASH = "Crash report";

	public static final String LICENSE_URL = "http://www.gnu.org/licenses/gpl-3.0.txt";
	
	public static final String SOURCE_URL = "https://github.com/blu3f1re/reddcoin-wallet";
	public static final String BINARY_URL = "http://blu3f1re.github.io/reddcoin-wallet/";
	public static final String CREDITS_BITCOINJ_URL = "https://github.com/blu3f1re/reddcoinj";
	
	
	public static final String CREDITS_ZXING_URL = "http://code.google.com/p/zxing/";
	public static final String CREDITS_ICON_URL = "http://reddcoin.com/";
	
	//TODO: Change
	public static final String AUTHOR_TWITTER_URL = "https://twitter.com/#!/";
	public static final String AUTHOR_GOOGLEPLUS_URL = "https://plus.google.com/+MaximilianKeller";
	public static final String COMMUNITY_GOOGLEPLUS_URL = ""; //TODO
	public static final String MARKET_APP_URL = "market://details?id=%s";
	public static final String WEBMARKET_APP_URL = "https://play.google.com/store/apps/details?id=%s";
	public static final String MARKET_PUBLISHER_URL = "market://search?q=pub:\"Blu3F1re\"";
	
	public static final String VERSION_URL = "http://wallet.blu3f1re.com/version";
	public static final int HTTP_TIMEOUT_MS = 15 * (int) DateUtils.SECOND_IN_MILLIS;

	public static final long LAST_USAGE_THRESHOLD_JUST_MS = DateUtils.HOUR_IN_MILLIS;
	public static final long LAST_USAGE_THRESHOLD_RECENTLY_MS = 2 * DateUtils.DAY_IN_MILLIS;

	public static final int SDK_JELLY_BEAN_MR2 = 18;

	public static final int SDK_DEPRECATED_BELOW = Build.VERSION_CODES.ICE_CREAM_SANDWICH;

	public static final int MEMORY_CLASS_LOWEND = 48;

	public static final Charset UTF_8 = Charset.forName("UTF-8");
	public static final Charset US_ASCII = Charset.forName("US-ASCII");
}
