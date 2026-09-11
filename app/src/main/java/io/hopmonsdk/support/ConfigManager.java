package io.hopmonsdk.support;

import android.content.Context;
import io.hopmonsdk.util.FileUtils;
import io.hopmonsdk.util.LogUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class ConfigManager {
    private static final String CONFIG_FILE = "hopmnproxy.cfg";
    private static final String NO_AUTH = "auth none";
    private static final String TAG = "ConfigManager";
    private Context mContext;
    private boolean mEnableLogging = false;

    public ConfigManager(Context context) {
        this.mContext = context;
    }

    private String clean(String str) {
        return str.replace("config:", "proxy ").replaceFirst(",$", "").replaceAll(",", ":");
    }

    public void setEnableLogging(boolean z) {
        this.mEnableLogging = z;
    }

    public File writeToFile(String str) {
        File file = new File(this.mContext.getFilesDir(), CONFIG_FILE);
        try {
            if (file.exists() && !file.delete()) {
                LogUtils.w(TAG, "hopmnproxy config file cannot deleted", new Object[0]);
                return file;
            }
            if (!file.createNewFile()) {
                LogUtils.w(TAG, "opmnproxy config file creation failed", new Object[0]);
                return file;
            }
            String strClean = clean(str);
            String str2 = TAG;
            LogUtils.d(str2, "Write new directive '%s' to hopmnproxy configuration file", strClean);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
            if (this.mEnableLogging) {
                File file2 = new File(this.mContext.getFilesDir(), "log");
                LogUtils.d(str2, "Enable logging to file %s", file2);
                bufferedWriter.append((CharSequence) ("log " + file2.getAbsolutePath() + " D"));
                bufferedWriter.newLine();
            }
            bufferedWriter.append((CharSequence) strClean);
            bufferedWriter.flush();
            bufferedWriter.close();
            fileOutputStream.flush();
            fileOutputStream.close();
            LogUtils.d(str2, "hopmnproxy config file wrote %s", CONFIG_FILE);
            LogUtils.d(str2, "Config:\n%s\n=========", FileUtils.toString(file));
            return file;
        } catch (IOException e) {
            LogUtils.e(TAG, "File write failed: ", e, new Object[0]);
            return file;
        }
    }
}
