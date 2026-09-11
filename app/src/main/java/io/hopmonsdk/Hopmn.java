package io.hopmonsdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.UiModeManager;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.compose.foundation.text.input.internal.o;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import com.app.mlounge.R;
import io.hopmonsdk.data.DataStore;
import io.hopmonsdk.seed.SeedDiscovery;
import io.hopmonsdk.service.HttpManager;
import io.hopmonsdk.service.MoneytiserService;
import io.hopmonsdk.support.ConfigManager;
import io.hopmonsdk.util.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class Hopmn extends BroadcastReceiver {
    public static final String ASYNC_JOB_SCHEDULER_KEY = "job_scheduler";
    public static final String CID_PLACE_HOLDER = "{cid}";
    public static final String COUNTRY_PLACE_HOLDER = "{country}";
    private static final String DEFAULT_CATEGORY = "888";
    private static final long DEFAULT_DELAY = 300000;
    private static final long DEFAULT_JOBSERVICE_DELAY = 900000;
    public static final String EVENT = "event";
    public static final String FOREGROUND_PLACE_HOLDER = "{foreground}";
    private static final String GET_ENDPOINT = "/?get=1&cc={country}&pub={publisher}&uid={uid}&foreground={foreground}&ver={ver}";
    private static final String KEY_CONSENT = "hopmon.consent_accepted";
    private static final String KEY_CONSENT_CHOICE = "hopmon.consent_choice";
    private static final String KEY_SEED_CSV = "hopmon.seed_servers_csv";
    public static final String NEED_FOREGROUND_KEY = "need_forground";
    public static final String NEED_RESTART_KEY = "need_restart";
    public static final String PUBLISHER_PLACE_HOLDER = "{publisher}";
    private static final String REG_ENDPOINT = "/?regcc=1&pub={publisher}&uid={uid}&cid={cid}&ver={ver}";
    public static final String TAG_PLACE_HOLDER = "{tag}";
    public static final String UID_PLACE_HOLDER = "{uid}";
    public static final String VER_PLACE_HOLDER = "{ver}";

    @SuppressLint({"StaticFieldLeak"})
    private static volatile Hopmn instance = null;
    private static long pullInterval = 900000;
    public static boolean userStopRequest = false;
    private String category;
    private String country;
    private long delayMillis;
    private String domain;
    private boolean foreground;
    private String getEndpoint;
    private boolean loggable;
    private final ConfigManager mConfigManager;
    private final Context mContext;
    private final DataStore mDataStore;
    private final HttpManager mHttpManager;
    private boolean mobileForeground;
    private String publisher;
    private String regEndpoint;
    private SeedDiscovery seedDiscovery;
    private String uid;
    private final ProxyServiceConnection proxyServiceConnection = new ProxyServiceConnection(this, null);
    private volatile boolean consentGrantedThisSession = false;
    private volatile boolean isConsentDialogShowing = false;

    /* JADX INFO: renamed from: io.hopmonsdk.Hopmn$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$hopmonsdk$Hopmn$ConsentChoice;

        static {
            int[] iArr = new int[ConsentChoice.values().length];
            $SwitchMap$io$hopmonsdk$Hopmn$ConsentChoice = iArr;
            try {
                iArr[ConsentChoice.BANDWIDTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$hopmonsdk$Hopmn$ConsentChoice[ConsentChoice.ADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$hopmonsdk$Hopmn$ConsentChoice[ConsentChoice.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @Keep
    public interface ConsentCallback {
        void onAgreed();

        void onDeclined();
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @Keep
    public enum ConsentChoice {
        BANDWIDTH,
        ADS,
        NONE
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @Keep
    public interface ConsentChoiceCallback {
        void onAdsChosen();

        void onBandwidthAgreed();

        void onDeclined();
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public enum Events {
        ERROR_CATCHED,
        REGISTERED,
        GET_CONFIG
    }

    private Hopmn(Context context, Builder builder) {
        androidx.localbroadcastmanager.content.b bVar;
        this.mContext = context;
        DataStore dataStore = new DataStore(context);
        this.mDataStore = dataStore;
        this.mHttpManager = new HttpManager(context);
        ConfigManager configManager = new ConfigManager(context);
        this.mConfigManager = configManager;
        configManager.setEnableLogging(builder.enable3proxyLogging);
        this.category = builder.category;
        String str = dataStore.get(context.getString(R.string.hopmon_publisher_key));
        if (TextUtils.isEmpty(builder.publisher)) {
            builder.withPublisher(str);
            this.publisher = str;
        } else {
            this.publisher = builder.publisher;
            dataStore.set(context.getString(R.string.hopmon_publisher_key), this.publisher);
        }
        String str2 = dataStore.get(context.getString(R.string.hopmon_country_key));
        this.country = str2;
        if (str2 == null) {
            this.country = "CC";
        }
        String str3 = dataStore.get(context.getString(R.string.hopmon_uid_key));
        this.uid = str3;
        if (str3 == null) {
            this.uid = "";
        }
        this.regEndpoint = builder.regEndpoint;
        this.getEndpoint = builder.getEndpoint;
        this.delayMillis = builder.delayMillis;
        this.loggable = builder.loggable;
        this.foreground = builder.foregroundService;
        this.mobileForeground = builder.mobileForeground;
        if (isForegroundRunning()) {
            dataStore.set(context.getString(R.string.hopmon_foreground), true);
        } else {
            dataStore.set(context.getString(R.string.hopmon_foreground), false);
        }
        String str4 = builder.seedServersCsv;
        if (TextUtils.isEmpty(str4)) {
            str4 = dataStore.get(KEY_SEED_CSV);
        } else {
            dataStore.set(KEY_SEED_CSV, str4);
        }
        if (!TextUtils.isEmpty(str4)) {
            ArrayList arrayList = new ArrayList();
            for (String str5 : str4.split(",")) {
                String strTrim = str5.trim();
                if (!strTrim.isEmpty()) {
                    arrayList.add(strTrim);
                }
            }
            if (!arrayList.isEmpty()) {
                this.seedDiscovery = new SeedDiscovery(arrayList);
                String strDeriveDomainFromSeeds = deriveDomainFromSeeds(str4);
                this.domain = strDeriveDomainFromSeeds;
                LogUtils.d("Hopmn", "Seed mode enabled, domain=%s, seeds=%s", strDeriveDomainFromSeeds, arrayList);
            }
        }
        synchronized (androidx.localbroadcastmanager.content.b.d) {
            try {
                if (androidx.localbroadcastmanager.content.b.e == null) {
                    androidx.localbroadcastmanager.content.b.e = new androidx.localbroadcastmanager.content.b(context.getApplicationContext());
                }
                bVar = androidx.localbroadcastmanager.content.b.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        IntentFilter intentFilter = new IntentFilter(Hopmn.class.getCanonicalName());
        synchronized (bVar.a) {
            try {
                o oVar = new o(29, intentFilter, this);
                ArrayList arrayList2 = (ArrayList) bVar.a.get(this);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    bVar.a.put(this, arrayList2);
                }
                arrayList2.add(oVar);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList arrayList3 = (ArrayList) bVar.b.get(action);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList(1);
                        bVar.b.put(action, arrayList3);
                    }
                    arrayList3.add(oVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Keep
    public static Builder builder() {
        return new Builder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Hopmn create(Context context, Builder builder) {
        if (instance == null) {
            synchronized (Hopmn.class) {
                try {
                    if (instance == null) {
                        if (context == null) {
                            throw new NullPointerException("Context cannot be null");
                        }
                        if (context.getApplicationContext() != null) {
                            context = context.getApplicationContext();
                        }
                        instance = new Hopmn(context, builder);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    private static String deriveDomainFromSeeds(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strTrim = str.split(",")[0].trim();
        int iIndexOf = strTrim.indexOf(46);
        return iIndexOf >= 0 ? strTrim.substring(iIndexOf + 1) : strTrim;
    }

    @Keep
    public static Hopmn getInstance(Context context) {
        if (instance == null) {
            synchronized (Hopmn.class) {
                try {
                    if (instance == null) {
                        DataStore dataStore = new DataStore(context);
                        boolean zIs = dataStore.is(context.getString(R.string.hopmon_foreground));
                        String str = dataStore.get(context.getString(R.string.hopmon_publisher_key));
                        if (TextUtils.isEmpty(str)) {
                            return null;
                        }
                        instance = new Builder().withPublisher(str).withForegroundService(Boolean.valueOf(zIs)).withMobileForeground(Boolean.valueOf(zIs)).loggable().build(context);
                        LogUtils.d("Hopmn", "call getInstance while instance equal null - Hopmn self initiation with pub=%s", str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showConsentIfNeeded$0(ConsentCallback consentCallback, DialogInterface dialogInterface, int i) {
        this.mDataStore.set(KEY_CONSENT, true);
        this.consentGrantedThisSession = true;
        consentCallback.onAgreed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showConsentWithAdsOption$2(ConsentChoiceCallback consentChoiceCallback, DialogInterface dialogInterface, int i) {
        this.isConsentDialogShowing = false;
        this.mDataStore.set(KEY_CONSENT_CHOICE, "bandwidth");
        this.mDataStore.set(KEY_CONSENT, true);
        this.consentGrantedThisSession = true;
        consentChoiceCallback.onBandwidthAgreed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showConsentWithAdsOption$3(ConsentChoiceCallback consentChoiceCallback, DialogInterface dialogInterface, int i) {
        this.isConsentDialogShowing = false;
        this.mDataStore.set(KEY_CONSENT_CHOICE, "ads");
        this.mDataStore.set(KEY_CONSENT, true);
        consentChoiceCallback.onAdsChosen();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showConsentWithAdsOption$4(ConsentChoiceCallback consentChoiceCallback, DialogInterface dialogInterface, int i) {
        this.isConsentDialogShowing = false;
        consentChoiceCallback.onDeclined();
    }

    public void cancleAsyncJob() {
        ((JobScheduler) this.mContext.getSystemService("jobscheduler")).cancel(Token.VAR);
    }

    public Hopmn enableConfigLogging() {
        this.mConfigManager.setEnableLogging(true);
        return this;
    }

    public String getCategory() {
        return this.category;
    }

    public ConfigManager getConfigManager() {
        return this.mConfigManager;
    }

    @Keep
    public ConsentChoice getConsentChoice() {
        String str = this.mDataStore.get(KEY_CONSENT_CHOICE);
        if ("bandwidth".equals(str)) {
            return ConsentChoice.BANDWIDTH;
        }
        return "ads".equals(str) ? ConsentChoice.ADS : ConsentChoice.NONE;
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getCountry() {
        return this.country;
    }

    public DataStore getDataStore() {
        return this.mDataStore;
    }

    public long getDelayMillis() {
        return this.delayMillis;
    }

    public String getDomain() {
        return this.domain;
    }

    public List<Throwable> getErrors() {
        return this.proxyServiceConnection.isBound() ? this.proxyServiceConnection.getMoneytiserService().getErrors() : new ArrayList();
    }

    public String getGetEndpoint() {
        return this.getEndpoint;
    }

    public HttpManager getHttpManager() {
        return this.mHttpManager;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public long getPullInterval() {
        return pullInterval;
    }

    public String getRegEndpoint() {
        return this.regEndpoint;
    }

    public int getRequestsCounts() {
        if (this.proxyServiceConnection.isBound()) {
            return this.proxyServiceConnection.getMoneytiserService().getRequestsCounts();
        }
        return 0;
    }

    public SeedDiscovery getSeedDiscovery() {
        return this.seedDiscovery;
    }

    public String getUid() {
        return this.uid;
    }

    @Keep
    public long getUpTime() {
        if (this.proxyServiceConnection.isBound()) {
            return this.proxyServiceConnection.getMoneytiserService().getProxyUpTime(TimeUnit.MILLISECONDS);
        }
        return 0L;
    }

    @Keep
    public boolean isConsentGiven() {
        return this.mDataStore.is(KEY_CONSENT);
    }

    public boolean isForegroundRequest() {
        return this.foreground;
    }

    public boolean isForegroundRunning() {
        if (!this.foreground || Build.VERSION.SDK_INT < 26) {
            return false;
        }
        return isTV() || isMobileForeground();
    }

    public boolean isLoggable() {
        return this.loggable;
    }

    public boolean isMobileForeground() {
        return this.mobileForeground;
    }

    @Keep
    public boolean isRunning() {
        return this.proxyServiceConnection.isBound() && this.proxyServiceConnection.getMoneytiserService() != null && this.proxyServiceConnection.getMoneytiserService().isRunning();
    }

    public boolean isSeedMode() {
        return this.seedDiscovery != null;
    }

    public boolean isTV() {
        if (((UiModeManager) this.mContext.getSystemService("uimode")).getCurrentModeType() == 4) {
            LogUtils.d("DeviceTypeRuntimeCheck", "Running on a TV Device", new Object[0]);
            return true;
        }
        LogUtils.d("DeviceTypeRuntimeCheck", "Running on a non-TV Device", new Object[0]);
        return false;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        LogUtils.d("receiver", c.h("Got message: ", intent.getStringExtra("message")), new Object[0]);
        if (intent.getBooleanExtra(NEED_RESTART_KEY, false)) {
            try {
                LogUtils.w("receiver", "Restarting Hopmn Service", new Object[0]);
                if (!start()) {
                    LogUtils.w("receiver", "Failed To restart Hopmn Service", new Object[0]);
                }
            } catch (Exception unused) {
                LogUtils.w("receiver", "Failed To restart Hopmn Service", new Object[0]);
            }
        }
    }

    @Keep
    public void reportUserConsent(ConsentChoice consentChoice) {
        int i = AnonymousClass1.$SwitchMap$io$hopmonsdk$Hopmn$ConsentChoice[consentChoice.ordinal()];
        if (i == 1) {
            this.mDataStore.set(KEY_CONSENT_CHOICE, "bandwidth");
            this.mDataStore.set(KEY_CONSENT, true);
            this.consentGrantedThisSession = true;
        } else if (i == 2) {
            this.mDataStore.set(KEY_CONSENT_CHOICE, "ads");
            this.mDataStore.set(KEY_CONSENT, true);
        } else {
            if (i != 3) {
                return;
            }
            this.mDataStore.set(KEY_CONSENT_CHOICE, "");
            this.mDataStore.set(KEY_CONSENT, false);
            this.consentGrantedThisSession = false;
        }
    }

    @Keep
    public void resetConsent() {
        this.mDataStore.set(KEY_CONSENT, false);
        this.mDataStore.set(KEY_CONSENT_CHOICE, "");
        this.consentGrantedThisSession = false;
        this.isConsentDialogShowing = false;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    @Keep
    public void showConsentIfNeeded(Activity activity, final ConsentCallback consentCallback) {
        if (!isConsentGiven()) {
            new AlertDialog.Builder(activity).setTitle("User Consent Required").setMessage("By using the app, you agree to contribute to a global ethical proxy network. This means:\n\n✔ Your device's IP may be securely used to route network requests for businesses, researchers, and security experts.\n✔ Your personal data and activities are NEVER collected, stored, or shared.\n✔ Participation helps support a free or enhanced experience on the app.\n\n🔹 Our network ensures responsible usage, complying with all legal and ethical guidelines.\n🔹 If you no longer wish to participate, you can opt out at any time by uninstalling the app.\n\nBy tapping \"I Agree,\" you consent to participate.").setCancelable(false).setPositiveButton("I Agree", new a(this, consentCallback, 3)).setNegativeButton("Exit", new DialogInterface.OnClickListener() { // from class: io.hopmonsdk.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    consentCallback.onDeclined();
                }
            }).show();
        } else {
            this.consentGrantedThisSession = true;
            consentCallback.onAgreed();
        }
    }

    @Keep
    public void showConsentNow(Activity activity, ConsentCallback consentCallback) {
        resetConsent();
        showConsentIfNeeded(activity, consentCallback);
    }

    @Keep
    public void showConsentWithAdsOption(Activity activity, ConsentChoiceCallback consentChoiceCallback) {
        if (getConsentChoice() == ConsentChoice.BANDWIDTH) {
            this.consentGrantedThisSession = true;
            consentChoiceCallback.onBandwidthAgreed();
        } else if (getConsentChoice() == ConsentChoice.ADS) {
            consentChoiceCallback.onAdsChosen();
        } else {
            if (this.isConsentDialogShowing) {
                return;
            }
            this.isConsentDialogShowing = true;
            new AlertDialog.Builder(activity).setTitle("User Consent Required").setMessage("This app is free. To use it without ads, tap AGREE to allow it to use a small portion of your unused network bandwidth to route anonymous web requests for businesses and researchers. Your personal data and browsing activity are never collected or shared.\n\nPrefer ads instead? Tap USE WITH ADS.\n\nIf you no longer wish to participate, you can opt out at any time by uninstalling the app.").setCancelable(false).setPositiveButton("AGREE", new a(this, consentChoiceCallback, 0)).setNeutralButton("USE WITH ADS", new a(this, consentChoiceCallback, 1)).setNegativeButton("EXIT", new a(this, consentChoiceCallback, 2)).create().show();
        }
    }

    @Keep
    public boolean start() {
        if (!isConsentGiven() && !this.consentGrantedThisSession) {
            LogUtils.e("Hopmn", "start() blocked: call showConsentIfNeeded() or showConsentWithAdsOption() before start()", new Object[0]);
            return false;
        }
        userStopRequest = false;
        Context applicationContext = this.mContext.getApplicationContext();
        Intent intent = new Intent(applicationContext, (Class<?>) MoneytiserService.class);
        intent.putExtra(NEED_FOREGROUND_KEY, true);
        try {
            this.mHttpManager.start();
            if (Build.VERSION.SDK_INT >= 26) {
                applicationContext.startForegroundService(intent);
            } else {
                applicationContext.startService(intent);
            }
            if (!this.proxyServiceConnection.isBound()) {
                try {
                    applicationContext.bindService(intent, this.proxyServiceConnection, 1);
                } catch (Exception e) {
                    LogUtils.e("Hopmn", "bindService failed", e, new Object[0]);
                }
            }
            LogUtils.d("Hopmn", "start() requested MoneytiserService", new Object[0]);
            return true;
        } catch (Exception e2) {
            LogUtils.e("Hopmn", "start() failed on SDK " + Build.VERSION.SDK_INT, e2, new Object[0]);
            return false;
        }
    }

    @Keep
    public void stop() {
        userStopRequest = true;
        Context applicationContext = this.mContext.getApplicationContext();
        try {
            if (this.proxyServiceConnection.isBound()) {
                applicationContext.unbindService(this.proxyServiceConnection);
            }
        } catch (Exception e) {
            LogUtils.e("Hopmn", "unbindService failed", e, new Object[0]);
        }
        try {
            applicationContext.stopService(new Intent(applicationContext, (Class<?>) MoneytiserService.class));
        } catch (Exception e2) {
            LogUtils.e("Hopmn", "stopService failed", e2, new Object[0]);
        }
    }

    @Keep
    public void showConsentNow(Activity activity, ConsentChoiceCallback consentChoiceCallback) {
        resetConsent();
        showConsentWithAdsOption(activity, consentChoiceCallback);
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public class ProxyServiceConnection implements ServiceConnection {
        private boolean bound;
        private MoneytiserService moneytiserService;

        private ProxyServiceConnection() {
            this.bound = false;
        }

        public MoneytiserService getMoneytiserService() {
            return this.moneytiserService;
        }

        public boolean isBound() {
            return this.bound;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.moneytiserService = ((MoneytiserService.ProxyServiceBinder) iBinder).getService();
            this.bound = true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.bound = false;
        }

        public /* synthetic */ ProxyServiceConnection(Hopmn hopmn, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    @Keep
    public static Hopmn getInstance() {
        return getInstance(false);
    }

    public static Hopmn getInstance(boolean z) {
        if (instance == null) {
            synchronized (Hopmn.class) {
                try {
                    if (instance == null && !z) {
                        throw new IllegalStateException("You need to call create() at least once to create the singleton");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @Keep
    public static class Builder {
        private boolean enable3proxyLogging;
        private boolean loggable;
        private boolean mobileForeground;
        private String publisher;
        private String seedServersCsv;
        private String userId;
        private String category = Hopmn.DEFAULT_CATEGORY;
        private String regEndpoint = Hopmn.REG_ENDPOINT;
        private String getEndpoint = Hopmn.GET_ENDPOINT;
        private long delayMillis = Hopmn.DEFAULT_DELAY;
        private boolean foregroundService = true;

        public Hopmn build(Context context, String str, String str2, int i) {
            String str3 = this.publisher;
            if (str3 == null || str3.trim().length() == 0) {
                net.luminis.tls.engine.impl.c.o("The publisher cannot be <null> or empty, you have to specify one");
                return null;
            }
            if (str == null || str.trim().length() == 0) {
                net.luminis.tls.engine.impl.c.o("The Appname cannot be <null> or empty, you have to specify one");
                return null;
            }
            if (str2 == null || str2.trim().length() == 0) {
                net.luminis.tls.engine.impl.c.o("The message cannot be <null> or empty, you have to specify one");
                return null;
            }
            if (i == 0) {
                net.luminis.tls.engine.impl.c.o("The icon cannot be <null> or empty, you have to specify one");
                return null;
            }
            DataStore dataStore = new DataStore(context);
            withForegroundService(Boolean.TRUE);
            dataStore.set("APPNAME", str);
            dataStore.set("PUBLISHER_PACKAGE", context.getPackageName());
            dataStore.set("ICON", i);
            dataStore.set("MESSAGE", str2);
            return Hopmn.create(context, this);
        }

        public Builder enable3proxyLogging() {
            this.enable3proxyLogging = true;
            return this;
        }

        public Builder loggable() {
            this.loggable = true;
            return this;
        }

        public Builder withCategory(String str) {
            this.category = str;
            return this;
        }

        public Builder withDelayInMillis(long j) {
            this.delayMillis = j;
            return this;
        }

        public Builder withForegroundService(Boolean bool) {
            this.foregroundService = bool.booleanValue();
            LogUtils.d("Hopmn", "withForegroundService: %s", Boolean.toString(bool.booleanValue()));
            return this;
        }

        public Builder withGetEndpoint(String str) {
            this.getEndpoint = str;
            return this;
        }

        public Builder withMobileForeground(Boolean bool) {
            this.mobileForeground = bool.booleanValue();
            LogUtils.d("Hopmn", "withMobileForeground: %s", Boolean.toString(bool.booleanValue()));
            return this;
        }

        public Builder withPublisher(String str) {
            this.publisher = str;
            LogUtils.d("Hopmn", "withPublisher: %s", str);
            return this;
        }

        public Builder withRegEndpoint(String str) {
            this.regEndpoint = str;
            return this;
        }

        public Builder withSeedServersCsv(String str) {
            this.seedServersCsv = str;
            return this;
        }

        public Hopmn build(Context context) {
            String str = this.publisher;
            if (str != null && str.trim().length() != 0) {
                return Hopmn.create(context, this);
            }
            net.luminis.tls.engine.impl.c.o("The publisher cannot be <null> or empty, you have to specify one");
            return null;
        }
    }
}
