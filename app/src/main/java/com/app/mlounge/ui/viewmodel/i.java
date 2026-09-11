package com.app.mlounge.ui.viewmodel;

import androidx.compose.foundation.gestures.c2;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public String A;
    public String B;
    public int C;
    public int D;
    public int E;
    public final /* synthetic */ k F;
    public String e;
    public String y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.F = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new i(this.F, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0200  */
    /* JADX WARN: Code duplicated, block: B:103:0x020b A[Catch: all -> 0x002b, Exception -> 0x002e, Merged into TryCatch #4 {all -> 0x002b, Exception -> 0x002e, blocks: (B:7:0x0026, B:233:0x059a, B:237:0x05a4, B:243:0x05d9, B:246:0x05e3, B:14:0x0033, B:220:0x055b, B:222:0x0564, B:227:0x0570, B:17:0x004a, B:212:0x051d, B:214:0x0525, B:217:0x0539, B:20:0x0064, B:208:0x04ed, B:23:0x007a, B:204:0x04ca, B:26:0x008a, B:201:0x04aa, B:29:0x0099, B:197:0x048b, B:32:0x00a8, B:192:0x0457, B:37:0x00b7, B:185:0x0425, B:187:0x042d, B:40:0x00c8, B:175:0x03e4, B:45:0x00db, B:166:0x039e, B:168:0x03a6, B:48:0x00ec, B:160:0x037a, B:162:0x0380, B:179:0x0401, B:181:0x0407, B:193:0x046f, B:51:0x00f9, B:153:0x034d, B:54:0x0104, B:101:0x0201, B:147:0x031e, B:57:0x0110, B:96:0x01de, B:98:0x01e6, B:103:0x020b, B:104:0x0212, B:60:0x011a, B:146:0x0317, B:63:0x012e, B:134:0x02d0, B:136:0x02d8, B:138:0x02de, B:140:0x02e4, B:143:0x02f1, B:239:0x05c7, B:240:0x05ce, B:66:0x013e, B:130:0x02b2, B:69:0x014e, B:126:0x0294, B:72:0x0159, B:123:0x027d, B:75:0x0165, B:115:0x0251, B:78:0x0171, B:110:0x0230, B:112:0x0238, B:116:0x0258, B:117:0x025f, B:79:0x017b, B:85:0x01ae, B:91:0x01c3, B:93:0x01c9, B:241:0x05cf, B:242:0x05d8, B:105:0x0213, B:107:0x021b, B:118:0x0260, B:120:0x026a, B:82:0x019b), top: B:253:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0213 A[Catch: all -> 0x002b, Exception -> 0x002e, Merged into TryCatch #4 {all -> 0x002b, Exception -> 0x002e, blocks: (B:7:0x0026, B:233:0x059a, B:237:0x05a4, B:243:0x05d9, B:246:0x05e3, B:14:0x0033, B:220:0x055b, B:222:0x0564, B:227:0x0570, B:17:0x004a, B:212:0x051d, B:214:0x0525, B:217:0x0539, B:20:0x0064, B:208:0x04ed, B:23:0x007a, B:204:0x04ca, B:26:0x008a, B:201:0x04aa, B:29:0x0099, B:197:0x048b, B:32:0x00a8, B:192:0x0457, B:37:0x00b7, B:185:0x0425, B:187:0x042d, B:40:0x00c8, B:175:0x03e4, B:45:0x00db, B:166:0x039e, B:168:0x03a6, B:48:0x00ec, B:160:0x037a, B:162:0x0380, B:179:0x0401, B:181:0x0407, B:193:0x046f, B:51:0x00f9, B:153:0x034d, B:54:0x0104, B:101:0x0201, B:147:0x031e, B:57:0x0110, B:96:0x01de, B:98:0x01e6, B:103:0x020b, B:104:0x0212, B:60:0x011a, B:146:0x0317, B:63:0x012e, B:134:0x02d0, B:136:0x02d8, B:138:0x02de, B:140:0x02e4, B:143:0x02f1, B:239:0x05c7, B:240:0x05ce, B:66:0x013e, B:130:0x02b2, B:69:0x014e, B:126:0x0294, B:72:0x0159, B:123:0x027d, B:75:0x0165, B:115:0x0251, B:78:0x0171, B:110:0x0230, B:112:0x0238, B:116:0x0258, B:117:0x025f, B:79:0x017b, B:85:0x01ae, B:91:0x01c3, B:93:0x01c9, B:241:0x05cf, B:242:0x05d8, B:105:0x0213, B:107:0x021b, B:118:0x0260, B:120:0x026a, B:82:0x019b), top: B:253:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x021b A[Catch: all -> 0x002b, Exception -> 0x002e, Merged into TryCatch #4 {all -> 0x002b, Exception -> 0x002e, blocks: (B:7:0x0026, B:233:0x059a, B:237:0x05a4, B:243:0x05d9, B:246:0x05e3, B:14:0x0033, B:220:0x055b, B:222:0x0564, B:227:0x0570, B:17:0x004a, B:212:0x051d, B:214:0x0525, B:217:0x0539, B:20:0x0064, B:208:0x04ed, B:23:0x007a, B:204:0x04ca, B:26:0x008a, B:201:0x04aa, B:29:0x0099, B:197:0x048b, B:32:0x00a8, B:192:0x0457, B:37:0x00b7, B:185:0x0425, B:187:0x042d, B:40:0x00c8, B:175:0x03e4, B:45:0x00db, B:166:0x039e, B:168:0x03a6, B:48:0x00ec, B:160:0x037a, B:162:0x0380, B:179:0x0401, B:181:0x0407, B:193:0x046f, B:51:0x00f9, B:153:0x034d, B:54:0x0104, B:101:0x0201, B:147:0x031e, B:57:0x0110, B:96:0x01de, B:98:0x01e6, B:103:0x020b, B:104:0x0212, B:60:0x011a, B:146:0x0317, B:63:0x012e, B:134:0x02d0, B:136:0x02d8, B:138:0x02de, B:140:0x02e4, B:143:0x02f1, B:239:0x05c7, B:240:0x05ce, B:66:0x013e, B:130:0x02b2, B:69:0x014e, B:126:0x0294, B:72:0x0159, B:123:0x027d, B:75:0x0165, B:115:0x0251, B:78:0x0171, B:110:0x0230, B:112:0x0238, B:116:0x0258, B:117:0x025f, B:79:0x017b, B:85:0x01ae, B:91:0x01c3, B:93:0x01c9, B:241:0x05cf, B:242:0x05d8, B:105:0x0213, B:107:0x021b, B:118:0x0260, B:120:0x026a, B:82:0x019b), top: B:253:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x022e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0230 A[Catch: all -> 0x002b, Exception -> 0x002e, Merged into TryCatch #4 {all -> 0x002b, Exception -> 0x002e, blocks: (B:7:0x0026, B:233:0x059a, B:237:0x05a4, B:243:0x05d9, B:246:0x05e3, B:14:0x0033, B:220:0x055b, B:222:0x0564, B:227:0x0570, B:17:0x004a, B:212:0x051d, B:214:0x0525, B:217:0x0539, B:20:0x0064, B:208:0x04ed, B:23:0x007a, B:204:0x04ca, B:26:0x008a, B:201:0x04aa, B:29:0x0099, B:197:0x048b, B:32:0x00a8, B:192:0x0457, B:37:0x00b7, B:185:0x0425, B:187:0x042d, B:40:0x00c8, B:175:0x03e4, B:45:0x00db, B:166:0x039e, B:168:0x03a6, B:48:0x00ec, B:160:0x037a, B:162:0x0380, B:179:0x0401, B:181:0x0407, B:193:0x046f, B:51:0x00f9, B:153:0x034d, B:54:0x0104, B:101:0x0201, B:147:0x031e, B:57:0x0110, B:96:0x01de, B:98:0x01e6, B:103:0x020b, B:104:0x0212, B:60:0x011a, B:146:0x0317, B:63:0x012e, B:134:0x02d0, B:136:0x02d8, B:138:0x02de, B:140:0x02e4, B:143:0x02f1, B:239:0x05c7, B:240:0x05ce, B:66:0x013e, B:130:0x02b2, B:69:0x014e, B:126:0x0294, B:72:0x0159, B:123:0x027d, B:75:0x0165, B:115:0x0251, B:78:0x0171, B:110:0x0230, B:112:0x0238, B:116:0x0258, B:117:0x025f, B:79:0x017b, B:85:0x01ae, B:91:0x01c3, B:93:0x01c9, B:241:0x05cf, B:242:0x05d8, B:105:0x0213, B:107:0x021b, B:118:0x0260, B:120:0x026a, B:82:0x019b), top: B:253:0x0018 }, PHI: r0 r1
  0x0230: PHI (r0v18 java.lang.Object) = (r0v14 java.lang.Object), (r0v23 java.lang.Object) binds: [B:108:0x022c, B:78:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0230: PHI (r1v13 java.lang.String) = (r1v11 java.lang.String), (r1v15 java.lang.String) binds: [B:108:0x022c, B:78:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:112:0x0238 A[Catch: all -> 0x002b, Exception -> 0x002e, Merged into TryCatch #4 {all -> 0x002b, Exception -> 0x002e, blocks: (B:7:0x0026, B:233:0x059a, B:237:0x05a4, B:243:0x05d9, B:246:0x05e3, B:14:0x0033, B:220:0x055b, B:222:0x0564, B:227:0x0570, B:17:0x004a, B:212:0x051d, B:214:0x0525, B:217:0x0539, B:20:0x0064, B:208:0x04ed, B:23:0x007a, B:204:0x04ca, B:26:0x008a, B:201:0x04aa, B:29:0x0099, B:197:0x048b, B:32:0x00a8, B:192:0x0457, B:37:0x00b7, B:185:0x0425, B:187:0x042d, B:40:0x00c8, B:175:0x03e4, B:45:0x00db, B:166:0x039e, B:168:0x03a6, B:48:0x00ec, B:160:0x037a, B:162:0x0380, B:179:0x0401, B:181:0x0407, B:193:0x046f, B:51:0x00f9, B:153:0x034d, B:54:0x0104, B:101:0x0201, B:147:0x031e, B:57:0x0110, B:96:0x01de, B:98:0x01e6, B:103:0x020b, B:104:0x0212, B:60:0x011a, B:146:0x0317, B:63:0x012e, B:134:0x02d0, B:136:0x02d8, B:138:0x02de, B:140:0x02e4, B:143:0x02f1, B:239:0x05c7, B:240:0x05ce, B:66:0x013e, B:130:0x02b2, B:69:0x014e, B:126:0x0294, B:72:0x0159, B:123:0x027d, B:75:0x0165, B:115:0x0251, B:78:0x0171, B:110:0x0230, B:112:0x0238, B:116:0x0258, B:117:0x025f, B:79:0x017b, B:85:0x01ae, B:91:0x01c3, B:93:0x01c9, B:241:0x05cf, B:242:0x05d8, B:105:0x0213, B:107:0x021b, B:118:0x0260, B:120:0x026a, B:82:0x019b), top: B:253:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x024f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0258 A[Catch: all -> 0x002b, Exception -> 0x002e, Merged into TryCatch #4 {all -> 0x002b, Exception -> 0x002e, blocks: (B:7:0x0026, B:233:0x059a, B:237:0x05a4, B:243:0x05d9, B:246:0x05e3, B:14:0x0033, B:220:0x055b, B:222:0x0564, B:227:0x0570, B:17:0x004a, B:212:0x051d, B:214:0x0525, B:217:0x0539, B:20:0x0064, B:208:0x04ed, B:23:0x007a, B:204:0x04ca, B:26:0x008a, B:201:0x04aa, B:29:0x0099, B:197:0x048b, B:32:0x00a8, B:192:0x0457, B:37:0x00b7, B:185:0x0425, B:187:0x042d, B:40:0x00c8, B:175:0x03e4, B:45:0x00db, B:166:0x039e, B:168:0x03a6, B:48:0x00ec, B:160:0x037a, B:162:0x0380, B:179:0x0401, B:181:0x0407, B:193:0x046f, B:51:0x00f9, B:153:0x034d, B:54:0x0104, B:101:0x0201, B:147:0x031e, B:57:0x0110, B:96:0x01de, B:98:0x01e6, B:103:0x020b, B:104:0x0212, B:60:0x011a, B:146:0x0317, B:63:0x012e, B:134:0x02d0, B:136:0x02d8, B:138:0x02de, B:140:0x02e4, B:143:0x02f1, B:239:0x05c7, B:240:0x05ce, B:66:0x013e, B:130:0x02b2, B:69:0x014e, B:126:0x0294, B:72:0x0159, B:123:0x027d, B:75:0x0165, B:115:0x0251, B:78:0x0171, B:110:0x0230, B:112:0x0238, B:116:0x0258, B:117:0x025f, B:79:0x017b, B:85:0x01ae, B:91:0x01c3, B:93:0x01c9, B:241:0x05cf, B:242:0x05d8, B:105:0x0213, B:107:0x021b, B:118:0x0260, B:120:0x026a, B:82:0x019b), top: B:253:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0260 A[Catch: all -> 0x002b, Exception -> 0x002e, Merged into TryCatch #4 {all -> 0x002b, Exception -> 0x002e, blocks: (B:7:0x0026, B:233:0x059a, B:237:0x05a4, B:243:0x05d9, B:246:0x05e3, B:14:0x0033, B:220:0x055b, B:222:0x0564, B:227:0x0570, B:17:0x004a, B:212:0x051d, B:214:0x0525, B:217:0x0539, B:20:0x0064, B:208:0x04ed, B:23:0x007a, B:204:0x04ca, B:26:0x008a, B:201:0x04aa, B:29:0x0099, B:197:0x048b, B:32:0x00a8, B:192:0x0457, B:37:0x00b7, B:185:0x0425, B:187:0x042d, B:40:0x00c8, B:175:0x03e4, B:45:0x00db, B:166:0x039e, B:168:0x03a6, B:48:0x00ec, B:160:0x037a, B:162:0x0380, B:179:0x0401, B:181:0x0407, B:193:0x046f, B:51:0x00f9, B:153:0x034d, B:54:0x0104, B:101:0x0201, B:147:0x031e, B:57:0x0110, B:96:0x01de, B:98:0x01e6, B:103:0x020b, B:104:0x0212, B:60:0x011a, B:146:0x0317, B:63:0x012e, B:134:0x02d0, B:136:0x02d8, B:138:0x02de, B:140:0x02e4, B:143:0x02f1, B:239:0x05c7, B:240:0x05ce, B:66:0x013e, B:130:0x02b2, B:69:0x014e, B:126:0x0294, B:72:0x0159, B:123:0x027d, B:75:0x0165, B:115:0x0251, B:78:0x0171, B:110:0x0230, B:112:0x0238, B:116:0x0258, B:117:0x025f, B:79:0x017b, B:85:0x01ae, B:91:0x01c3, B:93:0x01c9, B:241:0x05cf, B:242:0x05d8, B:105:0x0213, B:107:0x021b, B:118:0x0260, B:120:0x026a, B:82:0x019b), top: B:253:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x026a A[Catch: all -> 0x002b, Exception -> 0x002e, Merged into TryCatch #4 {all -> 0x002b, Exception -> 0x002e, blocks: (B:7:0x0026, B:233:0x059a, B:237:0x05a4, B:243:0x05d9, B:246:0x05e3, B:14:0x0033, B:220:0x055b, B:222:0x0564, B:227:0x0570, B:17:0x004a, B:212:0x051d, B:214:0x0525, B:217:0x0539, B:20:0x0064, B:208:0x04ed, B:23:0x007a, B:204:0x04ca, B:26:0x008a, B:201:0x04aa, B:29:0x0099, B:197:0x048b, B:32:0x00a8, B:192:0x0457, B:37:0x00b7, B:185:0x0425, B:187:0x042d, B:40:0x00c8, B:175:0x03e4, B:45:0x00db, B:166:0x039e, B:168:0x03a6, B:48:0x00ec, B:160:0x037a, B:162:0x0380, B:179:0x0401, B:181:0x0407, B:193:0x046f, B:51:0x00f9, B:153:0x034d, B:54:0x0104, B:101:0x0201, B:147:0x031e, B:57:0x0110, B:96:0x01de, B:98:0x01e6, B:103:0x020b, B:104:0x0212, B:60:0x011a, B:146:0x0317, B:63:0x012e, B:134:0x02d0, B:136:0x02d8, B:138:0x02de, B:140:0x02e4, B:143:0x02f1, B:239:0x05c7, B:240:0x05ce, B:66:0x013e, B:130:0x02b2, B:69:0x014e, B:126:0x0294, B:72:0x0159, B:123:0x027d, B:75:0x0165, B:115:0x0251, B:78:0x0171, B:110:0x0230, B:112:0x0238, B:116:0x0258, B:117:0x025f, B:79:0x017b, B:85:0x01ae, B:91:0x01c3, B:93:0x01c9, B:241:0x05cf, B:242:0x05d8, B:105:0x0213, B:107:0x021b, B:118:0x0260, B:120:0x026a, B:82:0x019b), top: B:253:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x027b  */
    /* JADX WARN: Code duplicated, block: B:123:0x027d A[Catch: all -> 0x002b, Exception -> 0x002e, Merged into TryCatch #4 {all -> 0x002b, Exception -> 0x002e, blocks: (B:7:0x0026, B:233:0x059a, B:237:0x05a4, B:243:0x05d9, B:246:0x05e3, B:14:0x0033, B:220:0x055b, B:222:0x0564, B:227:0x0570, B:17:0x004a, B:212:0x051d, B:214:0x0525, B:217:0x0539, B:20:0x0064, B:208:0x04ed, B:23:0x007a, B:204:0x04ca, B:26:0x008a, B:201:0x04aa, B:29:0x0099, B:197:0x048b, B:32:0x00a8, B:192:0x0457, B:37:0x00b7, B:185:0x0425, B:187:0x042d, B:40:0x00c8, B:175:0x03e4, B:45:0x00db, B:166:0x039e, B:168:0x03a6, B:48:0x00ec, B:160:0x037a, B:162:0x0380, B:179:0x0401, B:181:0x0407, B:193:0x046f, B:51:0x00f9, B:153:0x034d, B:54:0x0104, B:101:0x0201, B:147:0x031e, B:57:0x0110, B:96:0x01de, B:98:0x01e6, B:103:0x020b, B:104:0x0212, B:60:0x011a, B:146:0x0317, B:63:0x012e, B:134:0x02d0, B:136:0x02d8, B:138:0x02de, B:140:0x02e4, B:143:0x02f1, B:239:0x05c7, B:240:0x05ce, B:66:0x013e, B:130:0x02b2, B:69:0x014e, B:126:0x0294, B:72:0x0159, B:123:0x027d, B:75:0x0165, B:115:0x0251, B:78:0x0171, B:110:0x0230, B:112:0x0238, B:116:0x0258, B:117:0x025f, B:79:0x017b, B:85:0x01ae, B:91:0x01c3, B:93:0x01c9, B:241:0x05cf, B:242:0x05d8, B:105:0x0213, B:107:0x021b, B:118:0x0260, B:120:0x026a, B:82:0x019b), top: B:253:0x0018 }, PHI: r0 r1
  0x027d: PHI (r0v29 java.lang.Object) = (r0v10 java.lang.Object), (r0v32 java.lang.Object) binds: [B:121:0x0279, B:73:0x015c] A[DONT_GENERATE, DONT_INLINE]
  0x027d: PHI (r1v18 java.lang.String) = (r1v11 java.lang.String), (r1v19 java.lang.String) binds: [B:121:0x0279, B:73:0x015c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:125:0x0292  */
    /* JADX WARN: Code duplicated, block: B:126:0x0294 A[Catch: all -> 0x002b, Exception -> 0x002e, Merged into TryCatch #4 {all -> 0x002b, Exception -> 0x002e, blocks: (B:7:0x0026, B:233:0x059a, B:237:0x05a4, B:243:0x05d9, B:246:0x05e3, B:14:0x0033, B:220:0x055b, B:222:0x0564, B:227:0x0570, B:17:0x004a, B:212:0x051d, B:214:0x0525, B:217:0x0539, B:20:0x0064, B:208:0x04ed, B:23:0x007a, B:204:0x04ca, B:26:0x008a, B:201:0x04aa, B:29:0x0099, B:197:0x048b, B:32:0x00a8, B:192:0x0457, B:37:0x00b7, B:185:0x0425, B:187:0x042d, B:40:0x00c8, B:175:0x03e4, B:45:0x00db, B:166:0x039e, B:168:0x03a6, B:48:0x00ec, B:160:0x037a, B:162:0x0380, B:179:0x0401, B:181:0x0407, B:193:0x046f, B:51:0x00f9, B:153:0x034d, B:54:0x0104, B:101:0x0201, B:147:0x031e, B:57:0x0110, B:96:0x01de, B:98:0x01e6, B:103:0x020b, B:104:0x0212, B:60:0x011a, B:146:0x0317, B:63:0x012e, B:134:0x02d0, B:136:0x02d8, B:138:0x02de, B:140:0x02e4, B:143:0x02f1, B:239:0x05c7, B:240:0x05ce, B:66:0x013e, B:130:0x02b2, B:69:0x014e, B:126:0x0294, B:72:0x0159, B:123:0x027d, B:75:0x0165, B:115:0x0251, B:78:0x0171, B:110:0x0230, B:112:0x0238, B:116:0x0258, B:117:0x025f, B:79:0x017b, B:85:0x01ae, B:91:0x01c3, B:93:0x01c9, B:241:0x05cf, B:242:0x05d8, B:105:0x0213, B:107:0x021b, B:118:0x0260, B:120:0x026a, B:82:0x019b), top: B:253:0x0018 }, PHI: r0 r1 r4 r16
  0x0294: PHI (r0v33 java.lang.String) = (r0v30 java.lang.String), (r0v34 java.lang.String) binds: [B:124:0x0290, B:70:0x0151] A[DONT_GENERATE, DONT_INLINE]
  0x0294: PHI (r1v20 java.lang.String) = (r1v18 java.lang.String), (r1v22 java.lang.String) binds: [B:124:0x0290, B:70:0x0151] A[DONT_GENERATE, DONT_INLINE]
  0x0294: PHI (r4v15 java.lang.Object) = (r4v14 java.lang.Object), (r4v18 java.lang.Object) binds: [B:124:0x0290, B:70:0x0151] A[DONT_GENERATE, DONT_INLINE]
  0x0294: PHI (r16v8 int) = (r13v0 int), (r16v9 int) binds: [B:124:0x0290, B:70:0x0151] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:129:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:132:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:133:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:136:0x02d8 A[Catch: all -> 0x002b, Exception -> 0x002e, Merged into TryCatch #4 {all -> 0x002b, Exception -> 0x002e, blocks: (B:7:0x0026, B:233:0x059a, B:237:0x05a4, B:243:0x05d9, B:246:0x05e3, B:14:0x0033, B:220:0x055b, B:222:0x0564, B:227:0x0570, B:17:0x004a, B:212:0x051d, B:214:0x0525, B:217:0x0539, B:20:0x0064, B:208:0x04ed, B:23:0x007a, B:204:0x04ca, B:26:0x008a, B:201:0x04aa, B:29:0x0099, B:197:0x048b, B:32:0x00a8, B:192:0x0457, B:37:0x00b7, B:185:0x0425, B:187:0x042d, B:40:0x00c8, B:175:0x03e4, B:45:0x00db, B:166:0x039e, B:168:0x03a6, B:48:0x00ec, B:160:0x037a, B:162:0x0380, B:179:0x0401, B:181:0x0407, B:193:0x046f, B:51:0x00f9, B:153:0x034d, B:54:0x0104, B:101:0x0201, B:147:0x031e, B:57:0x0110, B:96:0x01de, B:98:0x01e6, B:103:0x020b, B:104:0x0212, B:60:0x011a, B:146:0x0317, B:63:0x012e, B:134:0x02d0, B:136:0x02d8, B:138:0x02de, B:140:0x02e4, B:143:0x02f1, B:239:0x05c7, B:240:0x05ce, B:66:0x013e, B:130:0x02b2, B:69:0x014e, B:126:0x0294, B:72:0x0159, B:123:0x027d, B:75:0x0165, B:115:0x0251, B:78:0x0171, B:110:0x0230, B:112:0x0238, B:116:0x0258, B:117:0x025f, B:79:0x017b, B:85:0x01ae, B:91:0x01c3, B:93:0x01c9, B:241:0x05cf, B:242:0x05d8, B:105:0x0213, B:107:0x021b, B:118:0x0260, B:120:0x026a, B:82:0x019b), top: B:253:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0347  */
    /* JADX WARN: Code duplicated, block: B:150:0x0348  */
    /* JADX WARN: Code duplicated, block: B:152:0x034b  */
    /* JADX WARN: Code duplicated, block: B:155:0x0372  */
    /* JADX WARN: Code duplicated, block: B:156:0x0373  */
    /* JADX WARN: Code duplicated, block: B:158:0x0376  */
    /* JADX WARN: Code duplicated, block: B:159:0x0378  */
    /* JADX WARN: Code duplicated, block: B:162:0x0380 A[Catch: all -> 0x002b, Exception -> 0x002e, Merged into TryCatch #4 {all -> 0x002b, Exception -> 0x002e, blocks: (B:7:0x0026, B:233:0x059a, B:237:0x05a4, B:243:0x05d9, B:246:0x05e3, B:14:0x0033, B:220:0x055b, B:222:0x0564, B:227:0x0570, B:17:0x004a, B:212:0x051d, B:214:0x0525, B:217:0x0539, B:20:0x0064, B:208:0x04ed, B:23:0x007a, B:204:0x04ca, B:26:0x008a, B:201:0x04aa, B:29:0x0099, B:197:0x048b, B:32:0x00a8, B:192:0x0457, B:37:0x00b7, B:185:0x0425, B:187:0x042d, B:40:0x00c8, B:175:0x03e4, B:45:0x00db, B:166:0x039e, B:168:0x03a6, B:48:0x00ec, B:160:0x037a, B:162:0x0380, B:179:0x0401, B:181:0x0407, B:193:0x046f, B:51:0x00f9, B:153:0x034d, B:54:0x0104, B:101:0x0201, B:147:0x031e, B:57:0x0110, B:96:0x01de, B:98:0x01e6, B:103:0x020b, B:104:0x0212, B:60:0x011a, B:146:0x0317, B:63:0x012e, B:134:0x02d0, B:136:0x02d8, B:138:0x02de, B:140:0x02e4, B:143:0x02f1, B:239:0x05c7, B:240:0x05ce, B:66:0x013e, B:130:0x02b2, B:69:0x014e, B:126:0x0294, B:72:0x0159, B:123:0x027d, B:75:0x0165, B:115:0x0251, B:78:0x0171, B:110:0x0230, B:112:0x0238, B:116:0x0258, B:117:0x025f, B:79:0x017b, B:85:0x01ae, B:91:0x01c3, B:93:0x01c9, B:241:0x05cf, B:242:0x05d8, B:105:0x0213, B:107:0x021b, B:118:0x0260, B:120:0x026a, B:82:0x019b), top: B:253:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x039a  */
    /* JADX WARN: Code duplicated, block: B:165:0x039c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0401 A[Catch: all -> 0x002b, Exception -> 0x002e, Merged into TryCatch #4 {all -> 0x002b, Exception -> 0x002e, blocks: (B:7:0x0026, B:233:0x059a, B:237:0x05a4, B:243:0x05d9, B:246:0x05e3, B:14:0x0033, B:220:0x055b, B:222:0x0564, B:227:0x0570, B:17:0x004a, B:212:0x051d, B:214:0x0525, B:217:0x0539, B:20:0x0064, B:208:0x04ed, B:23:0x007a, B:204:0x04ca, B:26:0x008a, B:201:0x04aa, B:29:0x0099, B:197:0x048b, B:32:0x00a8, B:192:0x0457, B:37:0x00b7, B:185:0x0425, B:187:0x042d, B:40:0x00c8, B:175:0x03e4, B:45:0x00db, B:166:0x039e, B:168:0x03a6, B:48:0x00ec, B:160:0x037a, B:162:0x0380, B:179:0x0401, B:181:0x0407, B:193:0x046f, B:51:0x00f9, B:153:0x034d, B:54:0x0104, B:101:0x0201, B:147:0x031e, B:57:0x0110, B:96:0x01de, B:98:0x01e6, B:103:0x020b, B:104:0x0212, B:60:0x011a, B:146:0x0317, B:63:0x012e, B:134:0x02d0, B:136:0x02d8, B:138:0x02de, B:140:0x02e4, B:143:0x02f1, B:239:0x05c7, B:240:0x05ce, B:66:0x013e, B:130:0x02b2, B:69:0x014e, B:126:0x0294, B:72:0x0159, B:123:0x027d, B:75:0x0165, B:115:0x0251, B:78:0x0171, B:110:0x0230, B:112:0x0238, B:116:0x0258, B:117:0x025f, B:79:0x017b, B:85:0x01ae, B:91:0x01c3, B:93:0x01c9, B:241:0x05cf, B:242:0x05d8, B:105:0x0213, B:107:0x021b, B:118:0x0260, B:120:0x026a, B:82:0x019b), top: B:253:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:181:0x0407 A[Catch: all -> 0x002b, Exception -> 0x002e, Merged into TryCatch #4 {all -> 0x002b, Exception -> 0x002e, blocks: (B:7:0x0026, B:233:0x059a, B:237:0x05a4, B:243:0x05d9, B:246:0x05e3, B:14:0x0033, B:220:0x055b, B:222:0x0564, B:227:0x0570, B:17:0x004a, B:212:0x051d, B:214:0x0525, B:217:0x0539, B:20:0x0064, B:208:0x04ed, B:23:0x007a, B:204:0x04ca, B:26:0x008a, B:201:0x04aa, B:29:0x0099, B:197:0x048b, B:32:0x00a8, B:192:0x0457, B:37:0x00b7, B:185:0x0425, B:187:0x042d, B:40:0x00c8, B:175:0x03e4, B:45:0x00db, B:166:0x039e, B:168:0x03a6, B:48:0x00ec, B:160:0x037a, B:162:0x0380, B:179:0x0401, B:181:0x0407, B:193:0x046f, B:51:0x00f9, B:153:0x034d, B:54:0x0104, B:101:0x0201, B:147:0x031e, B:57:0x0110, B:96:0x01de, B:98:0x01e6, B:103:0x020b, B:104:0x0212, B:60:0x011a, B:146:0x0317, B:63:0x012e, B:134:0x02d0, B:136:0x02d8, B:138:0x02de, B:140:0x02e4, B:143:0x02f1, B:239:0x05c7, B:240:0x05ce, B:66:0x013e, B:130:0x02b2, B:69:0x014e, B:126:0x0294, B:72:0x0159, B:123:0x027d, B:75:0x0165, B:115:0x0251, B:78:0x0171, B:110:0x0230, B:112:0x0238, B:116:0x0258, B:117:0x025f, B:79:0x017b, B:85:0x01ae, B:91:0x01c3, B:93:0x01c9, B:241:0x05cf, B:242:0x05d8, B:105:0x0213, B:107:0x021b, B:118:0x0260, B:120:0x026a, B:82:0x019b), top: B:253:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x0421  */
    /* JADX WARN: Code duplicated, block: B:184:0x0423  */
    /* JADX WARN: Code duplicated, block: B:193:0x046f A[Catch: all -> 0x002b, Exception -> 0x002e, Merged into TryCatch #4 {all -> 0x002b, Exception -> 0x002e, blocks: (B:7:0x0026, B:233:0x059a, B:237:0x05a4, B:243:0x05d9, B:246:0x05e3, B:14:0x0033, B:220:0x055b, B:222:0x0564, B:227:0x0570, B:17:0x004a, B:212:0x051d, B:214:0x0525, B:217:0x0539, B:20:0x0064, B:208:0x04ed, B:23:0x007a, B:204:0x04ca, B:26:0x008a, B:201:0x04aa, B:29:0x0099, B:197:0x048b, B:32:0x00a8, B:192:0x0457, B:37:0x00b7, B:185:0x0425, B:187:0x042d, B:40:0x00c8, B:175:0x03e4, B:45:0x00db, B:166:0x039e, B:168:0x03a6, B:48:0x00ec, B:160:0x037a, B:162:0x0380, B:179:0x0401, B:181:0x0407, B:193:0x046f, B:51:0x00f9, B:153:0x034d, B:54:0x0104, B:101:0x0201, B:147:0x031e, B:57:0x0110, B:96:0x01de, B:98:0x01e6, B:103:0x020b, B:104:0x0212, B:60:0x011a, B:146:0x0317, B:63:0x012e, B:134:0x02d0, B:136:0x02d8, B:138:0x02de, B:140:0x02e4, B:143:0x02f1, B:239:0x05c7, B:240:0x05ce, B:66:0x013e, B:130:0x02b2, B:69:0x014e, B:126:0x0294, B:72:0x0159, B:123:0x027d, B:75:0x0165, B:115:0x0251, B:78:0x0171, B:110:0x0230, B:112:0x0238, B:116:0x0258, B:117:0x025f, B:79:0x017b, B:85:0x01ae, B:91:0x01c3, B:93:0x01c9, B:241:0x05cf, B:242:0x05d8, B:105:0x0213, B:107:0x021b, B:118:0x0260, B:120:0x026a, B:82:0x019b), top: B:253:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x0487  */
    /* JADX WARN: Code duplicated, block: B:196:0x0489  */
    /* JADX WARN: Code duplicated, block: B:199:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:200:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:203:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:206:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:207:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:210:0x0511  */
    /* JADX WARN: Code duplicated, block: B:211:0x0513  */
    /* JADX WARN: Code duplicated, block: B:214:0x0525 A[Catch: all -> 0x002b, Exception -> 0x002e, Merged into TryCatch #4 {all -> 0x002b, Exception -> 0x002e, blocks: (B:7:0x0026, B:233:0x059a, B:237:0x05a4, B:243:0x05d9, B:246:0x05e3, B:14:0x0033, B:220:0x055b, B:222:0x0564, B:227:0x0570, B:17:0x004a, B:212:0x051d, B:214:0x0525, B:217:0x0539, B:20:0x0064, B:208:0x04ed, B:23:0x007a, B:204:0x04ca, B:26:0x008a, B:201:0x04aa, B:29:0x0099, B:197:0x048b, B:32:0x00a8, B:192:0x0457, B:37:0x00b7, B:185:0x0425, B:187:0x042d, B:40:0x00c8, B:175:0x03e4, B:45:0x00db, B:166:0x039e, B:168:0x03a6, B:48:0x00ec, B:160:0x037a, B:162:0x0380, B:179:0x0401, B:181:0x0407, B:193:0x046f, B:51:0x00f9, B:153:0x034d, B:54:0x0104, B:101:0x0201, B:147:0x031e, B:57:0x0110, B:96:0x01de, B:98:0x01e6, B:103:0x020b, B:104:0x0212, B:60:0x011a, B:146:0x0317, B:63:0x012e, B:134:0x02d0, B:136:0x02d8, B:138:0x02de, B:140:0x02e4, B:143:0x02f1, B:239:0x05c7, B:240:0x05ce, B:66:0x013e, B:130:0x02b2, B:69:0x014e, B:126:0x0294, B:72:0x0159, B:123:0x027d, B:75:0x0165, B:115:0x0251, B:78:0x0171, B:110:0x0230, B:112:0x0238, B:116:0x0258, B:117:0x025f, B:79:0x017b, B:85:0x01ae, B:91:0x01c3, B:93:0x01c9, B:241:0x05cf, B:242:0x05d8, B:105:0x0213, B:107:0x021b, B:118:0x0260, B:120:0x026a, B:82:0x019b), top: B:253:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:216:0x0538  */
    /* JADX WARN: Code duplicated, block: B:219:0x055a  */
    /* JADX WARN: Code duplicated, block: B:224:0x056a  */
    /* JADX WARN: Code duplicated, block: B:226:0x056e  */
    /* JADX WARN: Code duplicated, block: B:229:0x0595  */
    /* JADX WARN: Code duplicated, block: B:230:0x0596  */
    /* JADX WARN: Code duplicated, block: B:235:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:236:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:256:0x042d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x03a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:89:0x01be  */
    /* JADX WARN: Code duplicated, block: B:95:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:96:0x01de A[Catch: all -> 0x002b, Exception -> 0x002e, Merged into TryCatch #4 {all -> 0x002b, Exception -> 0x002e, blocks: (B:7:0x0026, B:233:0x059a, B:237:0x05a4, B:243:0x05d9, B:246:0x05e3, B:14:0x0033, B:220:0x055b, B:222:0x0564, B:227:0x0570, B:17:0x004a, B:212:0x051d, B:214:0x0525, B:217:0x0539, B:20:0x0064, B:208:0x04ed, B:23:0x007a, B:204:0x04ca, B:26:0x008a, B:201:0x04aa, B:29:0x0099, B:197:0x048b, B:32:0x00a8, B:192:0x0457, B:37:0x00b7, B:185:0x0425, B:187:0x042d, B:40:0x00c8, B:175:0x03e4, B:45:0x00db, B:166:0x039e, B:168:0x03a6, B:48:0x00ec, B:160:0x037a, B:162:0x0380, B:179:0x0401, B:181:0x0407, B:193:0x046f, B:51:0x00f9, B:153:0x034d, B:54:0x0104, B:101:0x0201, B:147:0x031e, B:57:0x0110, B:96:0x01de, B:98:0x01e6, B:103:0x020b, B:104:0x0212, B:60:0x011a, B:146:0x0317, B:63:0x012e, B:134:0x02d0, B:136:0x02d8, B:138:0x02de, B:140:0x02e4, B:143:0x02f1, B:239:0x05c7, B:240:0x05ce, B:66:0x013e, B:130:0x02b2, B:69:0x014e, B:126:0x0294, B:72:0x0159, B:123:0x027d, B:75:0x0165, B:115:0x0251, B:78:0x0171, B:110:0x0230, B:112:0x0238, B:116:0x0258, B:117:0x025f, B:79:0x017b, B:85:0x01ae, B:91:0x01c3, B:93:0x01c9, B:241:0x05cf, B:242:0x05d8, B:105:0x0213, B:107:0x021b, B:118:0x0260, B:120:0x026a, B:82:0x019b), top: B:253:0x0018 }, PHI: r0 r1
  0x01de: PHI (r0v49 java.lang.Object) = (r0v17 java.lang.Object), (r0v54 java.lang.Object) binds: [B:94:0x01db, B:58:0x0113] A[DONT_GENERATE, DONT_INLINE]
  0x01de: PHI (r1v33 java.lang.String) = (r1v11 java.lang.String), (r1v35 java.lang.String) binds: [B:94:0x01db, B:58:0x0113] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x01e6 A[Catch: all -> 0x002b, Exception -> 0x002e, Merged into TryCatch #4 {all -> 0x002b, Exception -> 0x002e, blocks: (B:7:0x0026, B:233:0x059a, B:237:0x05a4, B:243:0x05d9, B:246:0x05e3, B:14:0x0033, B:220:0x055b, B:222:0x0564, B:227:0x0570, B:17:0x004a, B:212:0x051d, B:214:0x0525, B:217:0x0539, B:20:0x0064, B:208:0x04ed, B:23:0x007a, B:204:0x04ca, B:26:0x008a, B:201:0x04aa, B:29:0x0099, B:197:0x048b, B:32:0x00a8, B:192:0x0457, B:37:0x00b7, B:185:0x0425, B:187:0x042d, B:40:0x00c8, B:175:0x03e4, B:45:0x00db, B:166:0x039e, B:168:0x03a6, B:48:0x00ec, B:160:0x037a, B:162:0x0380, B:179:0x0401, B:181:0x0407, B:193:0x046f, B:51:0x00f9, B:153:0x034d, B:54:0x0104, B:101:0x0201, B:147:0x031e, B:57:0x0110, B:96:0x01de, B:98:0x01e6, B:103:0x020b, B:104:0x0212, B:60:0x011a, B:146:0x0317, B:63:0x012e, B:134:0x02d0, B:136:0x02d8, B:138:0x02de, B:140:0x02e4, B:143:0x02f1, B:239:0x05c7, B:240:0x05ce, B:66:0x013e, B:130:0x02b2, B:69:0x014e, B:126:0x0294, B:72:0x0159, B:123:0x027d, B:75:0x0165, B:115:0x0251, B:78:0x0171, B:110:0x0230, B:112:0x0238, B:116:0x0258, B:117:0x025f, B:79:0x017b, B:85:0x01ae, B:91:0x01c3, B:93:0x01c9, B:241:0x05cf, B:242:0x05d8, B:105:0x0213, B:107:0x021b, B:118:0x0260, B:120:0x026a, B:82:0x019b), top: B:253:0x0018 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.app.mlounge.ui.viewmodel.h] */
    /* JADX WARN: Type inference failed for: r5v16, types: [com.app.mlounge.ui.viewmodel.h] */
    /* JADX WARN: Type inference failed for: r5v18, types: [com.app.mlounge.ui.viewmodel.h] */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.app.mlounge.ui.viewmodel.h] */
    /* JADX WARN: Type inference failed for: r5v42, types: [com.app.mlounge.ui.viewmodel.h] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objFirst;
        String str;
        int iHashCode;
        Object objFirst2;
        Object objFirst3;
        Object objFirst4;
        String str2;
        Object objI;
        int iIntValue;
        String str3;
        Object objFirst5;
        String str4;
        Object objFirst6;
        String str5;
        String str6;
        String str7;
        Object objFirst7;
        String str8;
        String str9;
        String str10;
        String str11;
        kotlin.coroutines.intrinsics.a aVar;
        Object objJ;
        String str12;
        Object objP;
        Object objS;
        String str13;
        Object objS2;
        String str14;
        Object objFirst8;
        int i;
        int i2;
        Object objFirst9;
        int i3;
        int i4;
        Object objFirst10;
        String str15;
        int i5;
        com.app.mlounge.data.iptv.l lVar;
        kotlin.jvm.functions.l lVar2;
        String str16;
        com.app.mlounge.data.iptv.l lVar3;
        ?? r3;
        int i6;
        String str17;
        Object objFirst11;
        String str18;
        int i7;
        String str19;
        Object objFirst12;
        String str20;
        Object objFirst13;
        String str21;
        String str22;
        String str23;
        Object objFirst14;
        int i8;
        String str24;
        String str25;
        String str26;
        Object objK;
        boolean z;
        Object objS3;
        String str27;
        int i9 = this.E;
        kotlin.y yVar = kotlin.y.a;
        int i10 = 1;
        final k kVar = this.F;
        kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
        try {
            switch (i9) {
                case 0:
                    kotlin.a.e(obj);
                    kVar.w.setValue(kotlin.coroutines.jvm.internal.f.a(true));
                    kVar.A.setValue(null);
                    kVar.y.setValue("Starting...");
                    Flow flowE = kVar.b.e();
                    this.E = 1;
                    objFirst = FlowKt.first(flowE, this);
                    if (objFirst != aVar2) {
                        str = (String) objFirst;
                        iHashCode = str.hashCode();
                        if (iHashCode != -748844389) {
                            if (str.equals("xtream")) {
                                Flow flow = kVar.b.Y;
                                this.e = str;
                                this.E = 4;
                                objFirst2 = FlowKt.first(flow, this);
                                if (objFirst2 == aVar2) {
                                    str3 = (String) objFirst2;
                                    Flow flow2 = kVar.b.Z;
                                    this.e = str;
                                    this.y = str3;
                                    this.E = 5;
                                    objFirst5 = FlowKt.first(flow2, this);
                                    if (objFirst5 != aVar2) {
                                        str4 = (String) objFirst5;
                                        Flow flow3 = kVar.b.a0;
                                        this.e = str;
                                        this.y = str3;
                                        this.z = str4;
                                        this.E = 6;
                                        objFirst6 = FlowKt.first(flow3, this);
                                        if (objFirst6 == aVar2) {
                                            str5 = str;
                                            str6 = str4;
                                            str7 = (String) objFirst6;
                                            Flow flow4 = kVar.b.b0;
                                            this.e = str5;
                                            this.y = str3;
                                            this.z = str6;
                                            this.A = str7;
                                            this.E = 7;
                                            objFirst7 = FlowKt.first(flow4, this);
                                            if (objFirst7 == aVar2) {
                                                str8 = str5;
                                                str9 = str3;
                                                str10 = str7;
                                                String str28 = (String) objFirst7;
                                                if (!kotlin.text.k.d0(str9) || kotlin.text.k.d0(str10) || kotlin.text.k.d0(str28)) {
                                                    throw new Exception("Host, username, and password are required");
                                                }
                                                String str29 = str10;
                                                com.app.mlounge.data.iptv.l lVar4 = kVar.c;
                                                if (kotlin.text.k.d0(str6)) {
                                                    str6 = null;
                                                }
                                                final int i11 = 1;
                                                ?? r5 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                                    @Override // kotlin.jvm.functions.l
                                                    public final Object invoke(Object obj2) {
                                                        String str30 = (String) obj2;
                                                        switch (i11) {
                                                            case 0:
                                                                kVar.y.setValue(str30);
                                                                break;
                                                            case 1:
                                                                kVar.y.setValue(str30);
                                                                break;
                                                            case 2:
                                                                kVar.y.setValue(str30);
                                                                break;
                                                            case 3:
                                                                kVar.y.setValue(str30);
                                                                break;
                                                            case 4:
                                                                kVar.y.setValue(str30);
                                                                break;
                                                            default:
                                                                kVar.y.setValue(str30);
                                                                break;
                                                        }
                                                        return kotlin.y.a;
                                                    }
                                                };
                                                this.e = str8;
                                                this.y = null;
                                                this.z = null;
                                                this.A = null;
                                                this.B = null;
                                                this.E = 8;
                                                str11 = "EPG failed (channels saved): ";
                                                aVar = aVar2;
                                                objJ = lVar4.j(str9, str6, str29, str28, r5, this);
                                                if (objJ == aVar) {
                                                    return aVar;
                                                }
                                                iIntValue = ((List) objJ).size();
                                                str = str8;
                                                com.app.mlounge.data.local.prefs.y1 y1Var = kVar.b;
                                                this.e = str;
                                                this.y = null;
                                                this.z = null;
                                                this.A = null;
                                                this.B = null;
                                                this.C = iIntValue;
                                                this.E = 11;
                                                objS = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var.a), new androidx.compose.foundation.gestures.d1(iIntValue, null, 1, false), this);
                                                if (objS == aVar) {
                                                    objS = yVar;
                                                }
                                                if (objS == aVar) {
                                                    return aVar;
                                                }
                                                com.app.mlounge.data.local.prefs.y1 y1Var2 = kVar.b;
                                                long jCurrentTimeMillis = System.currentTimeMillis();
                                                this.e = str;
                                                this.C = iIntValue;
                                                this.E = 12;
                                                str13 = str;
                                                objS2 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var2.a), new c2(jCurrentTimeMillis, null, 1), this);
                                                if (objS2 != aVar) {
                                                    objS2 = yVar;
                                                }
                                                if (objS2 == aVar) {
                                                    return aVar;
                                                }
                                                str14 = str13;
                                                if (kotlin.jvm.internal.l.a(str14, "m3u")) {
                                                    Flow flowA = kVar.b.a();
                                                    this.e = null;
                                                    this.C = iIntValue;
                                                    this.D = 0;
                                                    this.E = 13;
                                                    objFirst10 = FlowKt.first(flowA, this);
                                                    if (objFirst10 == aVar) {
                                                        return aVar;
                                                    }
                                                    i3 = iIntValue;
                                                    i4 = 0;
                                                    str15 = (String) objFirst10;
                                                    if (!kotlin.text.k.d0(str15)) {
                                                        kVar.y.setValue("Downloading EPG...");
                                                        lVar = kVar.c;
                                                        final int i12 = 3;
                                                        lVar2 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                                            @Override // kotlin.jvm.functions.l
                                                            public final Object invoke(Object obj2) {
                                                                String str30 = (String) obj2;
                                                                switch (i12) {
                                                                    case 0:
                                                                        kVar.y.setValue(str30);
                                                                        break;
                                                                    case 1:
                                                                        kVar.y.setValue(str30);
                                                                        break;
                                                                    case 2:
                                                                        kVar.y.setValue(str30);
                                                                        break;
                                                                    case 3:
                                                                        kVar.y.setValue(str30);
                                                                        break;
                                                                    case 4:
                                                                        kVar.y.setValue(str30);
                                                                        break;
                                                                    default:
                                                                        kVar.y.setValue(str30);
                                                                        break;
                                                                }
                                                                return kotlin.y.a;
                                                            }
                                                        };
                                                        this.e = null;
                                                        this.y = null;
                                                        this.C = i3;
                                                        this.D = i4;
                                                        this.E = 14;
                                                        lVar.getClass();
                                                        if (BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.iptv.b(lVar2, str15, lVar, null), this) == aVar) {
                                                            return aVar;
                                                        }
                                                        i6 = i3;
                                                        i2 = i10;
                                                        com.app.mlounge.data.local.prefs.y1 y1Var3 = kVar.b;
                                                        if (i2 != 0) {
                                                            z = i10;
                                                        } else {
                                                            z = 0;
                                                        }
                                                        this.e = null;
                                                        this.y = null;
                                                        this.z = null;
                                                        this.A = null;
                                                        this.B = null;
                                                        this.C = i6;
                                                        this.D = i2;
                                                        this.E = 23;
                                                        objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var3.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                                                        if (objS3 == aVar) {
                                                            objS3 = yVar;
                                                        }
                                                        if (objS3 == aVar) {
                                                            return aVar;
                                                        }
                                                        MutableStateFlow mutableStateFlow = kVar.y;
                                                        if (i2 != 0) {
                                                            str27 = " + EPG";
                                                        } else {
                                                            str27 = "";
                                                        }
                                                        mutableStateFlow.setValue("Done! " + i6 + " channels" + str27);
                                                        return yVar;
                                                    }
                                                    i2 = i4;
                                                    i6 = i3;
                                                    com.app.mlounge.data.local.prefs.y1 y1Var4 = kVar.b;
                                                    if (i2 != 0) {
                                                        z = i10;
                                                    } else {
                                                        z = 0;
                                                    }
                                                    this.e = null;
                                                    this.y = null;
                                                    this.z = null;
                                                    this.A = null;
                                                    this.B = null;
                                                    this.C = i6;
                                                    this.D = i2;
                                                    this.E = 23;
                                                    objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var4.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                                                    if (objS3 == aVar) {
                                                        objS3 = yVar;
                                                    }
                                                    if (objS3 == aVar) {
                                                        return aVar;
                                                    }
                                                    MutableStateFlow mutableStateFlow2 = kVar.y;
                                                    if (i2 != 0) {
                                                        str27 = " + EPG";
                                                    } else {
                                                        str27 = "";
                                                    }
                                                    mutableStateFlow2.setValue("Done! " + i6 + " channels" + str27);
                                                    return yVar;
                                                }
                                                if (kotlin.jvm.internal.l.a(str14, "local")) {
                                                    Flow flowB = kVar.b.b();
                                                    this.e = null;
                                                    this.C = iIntValue;
                                                    this.D = 0;
                                                    this.E = 15;
                                                    objFirst9 = FlowKt.first(flowB, this);
                                                    if (objFirst9 == aVar) {
                                                        return aVar;
                                                    }
                                                    i3 = iIntValue;
                                                    i4 = 0;
                                                    str16 = (String) objFirst9;
                                                    if (!kotlin.text.k.d0(str16)) {
                                                        kVar.y.setValue("Syncing local EPG...");
                                                        lVar3 = kVar.c;
                                                        final int i13 = 4;
                                                        r3 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                                            @Override // kotlin.jvm.functions.l
                                                            public final Object invoke(Object obj2) {
                                                                String str30 = (String) obj2;
                                                                switch (i13) {
                                                                    case 0:
                                                                        kVar.y.setValue(str30);
                                                                        break;
                                                                    case 1:
                                                                        kVar.y.setValue(str30);
                                                                        break;
                                                                    case 2:
                                                                        kVar.y.setValue(str30);
                                                                        break;
                                                                    case 3:
                                                                        kVar.y.setValue(str30);
                                                                        break;
                                                                    case 4:
                                                                        kVar.y.setValue(str30);
                                                                        break;
                                                                    default:
                                                                        kVar.y.setValue(str30);
                                                                        break;
                                                                }
                                                                return kotlin.y.a;
                                                            }
                                                        };
                                                        this.e = null;
                                                        this.y = null;
                                                        this.C = i3;
                                                        this.D = i4;
                                                        this.E = 16;
                                                        if (lVar3.o(str16, r3, this) == aVar) {
                                                            return aVar;
                                                        }
                                                        i6 = i3;
                                                        i2 = i10;
                                                        com.app.mlounge.data.local.prefs.y1 y1Var5 = kVar.b;
                                                        if (i2 != 0) {
                                                            z = i10;
                                                        } else {
                                                            z = 0;
                                                        }
                                                        this.e = null;
                                                        this.y = null;
                                                        this.z = null;
                                                        this.A = null;
                                                        this.B = null;
                                                        this.C = i6;
                                                        this.D = i2;
                                                        this.E = 23;
                                                        objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var5.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                                                        if (objS3 == aVar) {
                                                            objS3 = yVar;
                                                        }
                                                        if (objS3 == aVar) {
                                                            return aVar;
                                                        }
                                                        MutableStateFlow mutableStateFlow3 = kVar.y;
                                                        if (i2 != 0) {
                                                            str27 = " + EPG";
                                                        } else {
                                                            str27 = "";
                                                        }
                                                        mutableStateFlow3.setValue("Done! " + i6 + " channels" + str27);
                                                        return yVar;
                                                    }
                                                    i2 = i4;
                                                    i6 = i3;
                                                    com.app.mlounge.data.local.prefs.y1 y1Var6 = kVar.b;
                                                    if (i2 != 0) {
                                                        z = i10;
                                                    } else {
                                                        z = 0;
                                                    }
                                                    this.e = null;
                                                    this.y = null;
                                                    this.z = null;
                                                    this.A = null;
                                                    this.B = null;
                                                    this.C = i6;
                                                    this.D = i2;
                                                    this.E = 23;
                                                    objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var6.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                                                    if (objS3 == aVar) {
                                                        objS3 = yVar;
                                                    }
                                                    if (objS3 == aVar) {
                                                        return aVar;
                                                    }
                                                    MutableStateFlow mutableStateFlow4 = kVar.y;
                                                    if (i2 != 0) {
                                                        str27 = " + EPG";
                                                    } else {
                                                        str27 = "";
                                                    }
                                                    mutableStateFlow4.setValue("Done! " + i6 + " channels" + str27);
                                                    return yVar;
                                                }
                                                Flow flow5 = kVar.b.Y;
                                                this.e = null;
                                                this.C = iIntValue;
                                                this.D = 0;
                                                this.E = 17;
                                                objFirst8 = FlowKt.first(flow5, this);
                                                if (objFirst8 == aVar) {
                                                    return aVar;
                                                }
                                                i = iIntValue;
                                                i2 = 0;
                                                str17 = (String) objFirst8;
                                                Flow flow6 = kVar.b.Z;
                                                this.e = null;
                                                this.y = str17;
                                                this.C = i;
                                                this.D = i2;
                                                this.E = 18;
                                                objFirst11 = FlowKt.first(flow6, this);
                                                if (objFirst11 == aVar) {
                                                    return aVar;
                                                }
                                                str18 = str17;
                                                i7 = i;
                                                str19 = (String) objFirst11;
                                                Flow flow7 = kVar.b.a0;
                                                this.e = null;
                                                this.y = str18;
                                                this.z = str19;
                                                this.C = i7;
                                                this.D = i2;
                                                this.E = 19;
                                                objFirst12 = FlowKt.first(flow7, this);
                                                if (objFirst12 == aVar) {
                                                    return aVar;
                                                }
                                                str20 = (String) objFirst12;
                                                Flow flow8 = kVar.b.b0;
                                                this.e = null;
                                                this.y = str18;
                                                this.z = str19;
                                                this.A = str20;
                                                this.C = i7;
                                                this.D = i2;
                                                this.E = 20;
                                                objFirst13 = FlowKt.first(flow8, this);
                                                if (objFirst13 == aVar) {
                                                    return aVar;
                                                }
                                                str21 = str18;
                                                str22 = str20;
                                                str23 = (String) objFirst13;
                                                Flow flowF = kVar.b.f();
                                                this.e = null;
                                                this.y = str21;
                                                this.z = str19;
                                                this.A = str22;
                                                this.B = str23;
                                                this.C = i7;
                                                this.D = i2;
                                                this.E = 21;
                                                objFirst14 = FlowKt.first(flowF, this);
                                                if (objFirst14 == aVar) {
                                                    return aVar;
                                                }
                                                String str30 = str21;
                                                i8 = i7;
                                                str24 = str30;
                                                String str31 = str22;
                                                str25 = str23;
                                                str26 = str31;
                                                if (((Boolean) objFirst14).booleanValue()) {
                                                    kVar.y.setValue("Trying built-in EPG feed...");
                                                    com.app.mlounge.data.iptv.l lVar5 = kVar.c;
                                                    if (kotlin.text.k.d0(str19)) {
                                                        str19 = null;
                                                    }
                                                    final int i14 = 5;
                                                    ?? r6 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                                        @Override // kotlin.jvm.functions.l
                                                        public final Object invoke(Object obj2) {
                                                            String str32 = (String) obj2;
                                                            switch (i14) {
                                                                case 0:
                                                                    kVar.y.setValue(str32);
                                                                    break;
                                                                case 1:
                                                                    kVar.y.setValue(str32);
                                                                    break;
                                                                case 2:
                                                                    kVar.y.setValue(str32);
                                                                    break;
                                                                case 3:
                                                                    kVar.y.setValue(str32);
                                                                    break;
                                                                case 4:
                                                                    kVar.y.setValue(str32);
                                                                    break;
                                                                default:
                                                                    kVar.y.setValue(str32);
                                                                    break;
                                                            }
                                                            return kotlin.y.a;
                                                        }
                                                    };
                                                    this.e = null;
                                                    this.y = null;
                                                    this.z = null;
                                                    this.A = null;
                                                    this.B = null;
                                                    this.C = i8;
                                                    this.D = i2;
                                                    this.E = 22;
                                                    objK = lVar5.k(str24, str19, str26, str25, r6, this);
                                                    if (objK == aVar) {
                                                        return aVar;
                                                    }
                                                    i2 = !((Map) objK).isEmpty() ? 1 : 0;
                                                }
                                                i6 = i8;
                                                com.app.mlounge.data.local.prefs.y1 y1Var7 = kVar.b;
                                                if (i2 != 0) {
                                                    z = i10;
                                                } else {
                                                    z = 0;
                                                }
                                                this.e = null;
                                                this.y = null;
                                                this.z = null;
                                                this.A = null;
                                                this.B = null;
                                                this.C = i6;
                                                this.D = i2;
                                                this.E = 23;
                                                objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var7.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                                                if (objS3 == aVar) {
                                                    objS3 = yVar;
                                                }
                                                if (objS3 == aVar) {
                                                    return aVar;
                                                }
                                                MutableStateFlow mutableStateFlow5 = kVar.y;
                                                if (i2 != 0) {
                                                    str27 = " + EPG";
                                                } else {
                                                    str27 = "";
                                                }
                                                mutableStateFlow5.setValue("Done! " + i6 + " channels" + str27);
                                                return yVar;
                                            }
                                        }
                                    }
                                }
                            }
                            throw new Exception("Unknown type: ".concat(str));
                        }
                        if (iHashCode == 106447) {
                            if (str.equals("m3u")) {
                                Flow flowD = kVar.b.d();
                                this.e = str;
                                this.E = 2;
                                objFirst3 = FlowKt.first(flowD, this);
                                if (objFirst3 == aVar2) {
                                    str2 = (String) objFirst3;
                                    if (kotlin.text.k.d0(str2)) {
                                        throw new Exception("M3U URL is required");
                                    }
                                    com.app.mlounge.data.iptv.l lVar6 = kVar.c;
                                    final int i15 = 0;
                                    ?? r7 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                        @Override // kotlin.jvm.functions.l
                                        public final Object invoke(Object obj2) {
                                            String str32 = (String) obj2;
                                            switch (i15) {
                                                case 0:
                                                    kVar.y.setValue(str32);
                                                    break;
                                                case 1:
                                                    kVar.y.setValue(str32);
                                                    break;
                                                case 2:
                                                    kVar.y.setValue(str32);
                                                    break;
                                                case 3:
                                                    kVar.y.setValue(str32);
                                                    break;
                                                case 4:
                                                    kVar.y.setValue(str32);
                                                    break;
                                                default:
                                                    kVar.y.setValue(str32);
                                                    break;
                                            }
                                            return kotlin.y.a;
                                        }
                                    };
                                    this.e = str;
                                    this.y = null;
                                    this.E = 3;
                                    objI = lVar6.i(str2, r7, this);
                                    if (objI == aVar2) {
                                    }
                                    iIntValue = ((Number) objI).intValue();
                                    str11 = "EPG failed (channels saved): ";
                                    aVar = aVar2;
                                    com.app.mlounge.data.local.prefs.y1 y1Var8 = kVar.b;
                                    this.e = str;
                                    this.y = null;
                                    this.z = null;
                                    this.A = null;
                                    this.B = null;
                                    this.C = iIntValue;
                                    this.E = 11;
                                    objS = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var8.a), new androidx.compose.foundation.gestures.d1(iIntValue, null, 1, false), this);
                                    if (objS == aVar) {
                                        objS = yVar;
                                    }
                                    if (objS == aVar) {
                                        return aVar;
                                    }
                                    com.app.mlounge.data.local.prefs.y1 y1Var9 = kVar.b;
                                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                                    this.e = str;
                                    this.C = iIntValue;
                                    this.E = 12;
                                    str13 = str;
                                    objS2 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var9.a), new c2(jCurrentTimeMillis2, null, 1), this);
                                    if (objS2 != aVar) {
                                        objS2 = yVar;
                                    }
                                    if (objS2 == aVar) {
                                        return aVar;
                                    }
                                    str14 = str13;
                                    if (kotlin.jvm.internal.l.a(str14, "m3u")) {
                                        Flow flowA2 = kVar.b.a();
                                        this.e = null;
                                        this.C = iIntValue;
                                        this.D = 0;
                                        this.E = 13;
                                        objFirst10 = FlowKt.first(flowA2, this);
                                        if (objFirst10 == aVar) {
                                            return aVar;
                                        }
                                        i3 = iIntValue;
                                        i4 = 0;
                                        str15 = (String) objFirst10;
                                        if (!kotlin.text.k.d0(str15)) {
                                            kVar.y.setValue("Downloading EPG...");
                                            lVar = kVar.c;
                                            final int i16 = 3;
                                            lVar2 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                                @Override // kotlin.jvm.functions.l
                                                public final Object invoke(Object obj2) {
                                                    String str32 = (String) obj2;
                                                    switch (i16) {
                                                        case 0:
                                                            kVar.y.setValue(str32);
                                                            break;
                                                        case 1:
                                                            kVar.y.setValue(str32);
                                                            break;
                                                        case 2:
                                                            kVar.y.setValue(str32);
                                                            break;
                                                        case 3:
                                                            kVar.y.setValue(str32);
                                                            break;
                                                        case 4:
                                                            kVar.y.setValue(str32);
                                                            break;
                                                        default:
                                                            kVar.y.setValue(str32);
                                                            break;
                                                    }
                                                    return kotlin.y.a;
                                                }
                                            };
                                            this.e = null;
                                            this.y = null;
                                            this.C = i3;
                                            this.D = i4;
                                            this.E = 14;
                                            lVar.getClass();
                                            if (BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.iptv.b(lVar2, str15, lVar, null), this) == aVar) {
                                                return aVar;
                                            }
                                            i6 = i3;
                                            i2 = i10;
                                            com.app.mlounge.data.local.prefs.y1 y1Var10 = kVar.b;
                                            if (i2 != 0) {
                                                z = i10;
                                            } else {
                                                z = 0;
                                            }
                                            this.e = null;
                                            this.y = null;
                                            this.z = null;
                                            this.A = null;
                                            this.B = null;
                                            this.C = i6;
                                            this.D = i2;
                                            this.E = 23;
                                            objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var10.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                                            if (objS3 == aVar) {
                                                objS3 = yVar;
                                            }
                                            if (objS3 == aVar) {
                                                return aVar;
                                            }
                                            MutableStateFlow mutableStateFlow6 = kVar.y;
                                            if (i2 != 0) {
                                                str27 = " + EPG";
                                            } else {
                                                str27 = "";
                                            }
                                            mutableStateFlow6.setValue("Done! " + i6 + " channels" + str27);
                                            return yVar;
                                        }
                                        i2 = i4;
                                        i6 = i3;
                                        com.app.mlounge.data.local.prefs.y1 y1Var11 = kVar.b;
                                        if (i2 != 0) {
                                            z = i10;
                                        } else {
                                            z = 0;
                                        }
                                        this.e = null;
                                        this.y = null;
                                        this.z = null;
                                        this.A = null;
                                        this.B = null;
                                        this.C = i6;
                                        this.D = i2;
                                        this.E = 23;
                                        objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var11.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                                        if (objS3 == aVar) {
                                            objS3 = yVar;
                                        }
                                        if (objS3 == aVar) {
                                            return aVar;
                                        }
                                        MutableStateFlow mutableStateFlow7 = kVar.y;
                                        if (i2 != 0) {
                                            str27 = " + EPG";
                                        } else {
                                            str27 = "";
                                        }
                                        mutableStateFlow7.setValue("Done! " + i6 + " channels" + str27);
                                        return yVar;
                                    }
                                    if (kotlin.jvm.internal.l.a(str14, "local")) {
                                        Flow flowB2 = kVar.b.b();
                                        this.e = null;
                                        this.C = iIntValue;
                                        this.D = 0;
                                        this.E = 15;
                                        objFirst9 = FlowKt.first(flowB2, this);
                                        if (objFirst9 == aVar) {
                                            return aVar;
                                        }
                                        i3 = iIntValue;
                                        i4 = 0;
                                        str16 = (String) objFirst9;
                                        if (!kotlin.text.k.d0(str16)) {
                                            kVar.y.setValue("Syncing local EPG...");
                                            lVar3 = kVar.c;
                                            final int i17 = 4;
                                            r3 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                                @Override // kotlin.jvm.functions.l
                                                public final Object invoke(Object obj2) {
                                                    String str32 = (String) obj2;
                                                    switch (i17) {
                                                        case 0:
                                                            kVar.y.setValue(str32);
                                                            break;
                                                        case 1:
                                                            kVar.y.setValue(str32);
                                                            break;
                                                        case 2:
                                                            kVar.y.setValue(str32);
                                                            break;
                                                        case 3:
                                                            kVar.y.setValue(str32);
                                                            break;
                                                        case 4:
                                                            kVar.y.setValue(str32);
                                                            break;
                                                        default:
                                                            kVar.y.setValue(str32);
                                                            break;
                                                    }
                                                    return kotlin.y.a;
                                                }
                                            };
                                            this.e = null;
                                            this.y = null;
                                            this.C = i3;
                                            this.D = i4;
                                            this.E = 16;
                                            if (lVar3.o(str16, r3, this) == aVar) {
                                                return aVar;
                                            }
                                            i6 = i3;
                                            i2 = i10;
                                            com.app.mlounge.data.local.prefs.y1 y1Var12 = kVar.b;
                                            if (i2 != 0) {
                                                z = i10;
                                            } else {
                                                z = 0;
                                            }
                                            this.e = null;
                                            this.y = null;
                                            this.z = null;
                                            this.A = null;
                                            this.B = null;
                                            this.C = i6;
                                            this.D = i2;
                                            this.E = 23;
                                            objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var12.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                                            if (objS3 == aVar) {
                                                objS3 = yVar;
                                            }
                                            if (objS3 == aVar) {
                                                return aVar;
                                            }
                                            MutableStateFlow mutableStateFlow8 = kVar.y;
                                            if (i2 != 0) {
                                                str27 = " + EPG";
                                            } else {
                                                str27 = "";
                                            }
                                            mutableStateFlow8.setValue("Done! " + i6 + " channels" + str27);
                                            return yVar;
                                        }
                                        i2 = i4;
                                        i6 = i3;
                                        com.app.mlounge.data.local.prefs.y1 y1Var13 = kVar.b;
                                        if (i2 != 0) {
                                            z = i10;
                                        } else {
                                            z = 0;
                                        }
                                        this.e = null;
                                        this.y = null;
                                        this.z = null;
                                        this.A = null;
                                        this.B = null;
                                        this.C = i6;
                                        this.D = i2;
                                        this.E = 23;
                                        objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var13.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                                        if (objS3 == aVar) {
                                            objS3 = yVar;
                                        }
                                        if (objS3 == aVar) {
                                            return aVar;
                                        }
                                        MutableStateFlow mutableStateFlow9 = kVar.y;
                                        if (i2 != 0) {
                                            str27 = " + EPG";
                                        } else {
                                            str27 = "";
                                        }
                                        mutableStateFlow9.setValue("Done! " + i6 + " channels" + str27);
                                        return yVar;
                                    }
                                    Flow flow9 = kVar.b.Y;
                                    this.e = null;
                                    this.C = iIntValue;
                                    this.D = 0;
                                    this.E = 17;
                                    objFirst8 = FlowKt.first(flow9, this);
                                    if (objFirst8 == aVar) {
                                        return aVar;
                                    }
                                    i = iIntValue;
                                    i2 = 0;
                                    str17 = (String) objFirst8;
                                    Flow flow10 = kVar.b.Z;
                                    this.e = null;
                                    this.y = str17;
                                    this.C = i;
                                    this.D = i2;
                                    this.E = 18;
                                    objFirst11 = FlowKt.first(flow10, this);
                                    if (objFirst11 == aVar) {
                                        return aVar;
                                    }
                                    str18 = str17;
                                    i7 = i;
                                    str19 = (String) objFirst11;
                                    Flow flow11 = kVar.b.a0;
                                    this.e = null;
                                    this.y = str18;
                                    this.z = str19;
                                    this.C = i7;
                                    this.D = i2;
                                    this.E = 19;
                                    objFirst12 = FlowKt.first(flow11, this);
                                    if (objFirst12 == aVar) {
                                        return aVar;
                                    }
                                    str20 = (String) objFirst12;
                                    Flow flow12 = kVar.b.b0;
                                    this.e = null;
                                    this.y = str18;
                                    this.z = str19;
                                    this.A = str20;
                                    this.C = i7;
                                    this.D = i2;
                                    this.E = 20;
                                    objFirst13 = FlowKt.first(flow12, this);
                                    if (objFirst13 == aVar) {
                                        return aVar;
                                    }
                                    str21 = str18;
                                    str22 = str20;
                                    str23 = (String) objFirst13;
                                    Flow flowF2 = kVar.b.f();
                                    this.e = null;
                                    this.y = str21;
                                    this.z = str19;
                                    this.A = str22;
                                    this.B = str23;
                                    this.C = i7;
                                    this.D = i2;
                                    this.E = 21;
                                    objFirst14 = FlowKt.first(flowF2, this);
                                    if (objFirst14 == aVar) {
                                        return aVar;
                                    }
                                    String str32 = str21;
                                    i8 = i7;
                                    str24 = str32;
                                    String str33 = str22;
                                    str25 = str23;
                                    str26 = str33;
                                    if (((Boolean) objFirst14).booleanValue()) {
                                        kVar.y.setValue("Trying built-in EPG feed...");
                                        com.app.mlounge.data.iptv.l lVar7 = kVar.c;
                                        if (kotlin.text.k.d0(str19)) {
                                            str19 = null;
                                        }
                                        final int i18 = 5;
                                        ?? r8 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                            @Override // kotlin.jvm.functions.l
                                            public final Object invoke(Object obj2) {
                                                String str34 = (String) obj2;
                                                switch (i18) {
                                                    case 0:
                                                        kVar.y.setValue(str34);
                                                        break;
                                                    case 1:
                                                        kVar.y.setValue(str34);
                                                        break;
                                                    case 2:
                                                        kVar.y.setValue(str34);
                                                        break;
                                                    case 3:
                                                        kVar.y.setValue(str34);
                                                        break;
                                                    case 4:
                                                        kVar.y.setValue(str34);
                                                        break;
                                                    default:
                                                        kVar.y.setValue(str34);
                                                        break;
                                                }
                                                return kotlin.y.a;
                                            }
                                        };
                                        this.e = null;
                                        this.y = null;
                                        this.z = null;
                                        this.A = null;
                                        this.B = null;
                                        this.C = i8;
                                        this.D = i2;
                                        this.E = 22;
                                        objK = lVar7.k(str24, str19, str26, str25, r8, this);
                                        if (objK == aVar) {
                                            return aVar;
                                        }
                                        i2 = !((Map) objK).isEmpty() ? 1 : 0;
                                    }
                                    i6 = i8;
                                    com.app.mlounge.data.local.prefs.y1 y1Var14 = kVar.b;
                                    if (i2 != 0) {
                                        z = i10;
                                    } else {
                                        z = 0;
                                    }
                                    this.e = null;
                                    this.y = null;
                                    this.z = null;
                                    this.A = null;
                                    this.B = null;
                                    this.C = i6;
                                    this.D = i2;
                                    this.E = 23;
                                    objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var14.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                                    if (objS3 == aVar) {
                                        objS3 = yVar;
                                    }
                                    if (objS3 == aVar) {
                                        return aVar;
                                    }
                                    MutableStateFlow mutableStateFlow10 = kVar.y;
                                    if (i2 != 0) {
                                        str27 = " + EPG";
                                    } else {
                                        str27 = "";
                                    }
                                    mutableStateFlow10.setValue("Done! " + i6 + " channels" + str27);
                                    return yVar;
                                }
                            }
                            throw new Exception("Unknown type: ".concat(str));
                        }
                        if (iHashCode == 103145323 && str.equals("local")) {
                            Flow flowC = kVar.b.c();
                            this.e = str;
                            this.E = 9;
                            objFirst4 = FlowKt.first(flowC, this);
                            if (objFirst4 == aVar2) {
                                str12 = (String) objFirst4;
                                if (kotlin.text.k.d0(str12)) {
                                    throw new Exception("Local M3U file is required");
                                }
                                com.app.mlounge.data.iptv.l lVar8 = kVar.c;
                                final int i19 = 2;
                                ?? r9 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                    @Override // kotlin.jvm.functions.l
                                    public final Object invoke(Object obj2) {
                                        String str34 = (String) obj2;
                                        switch (i19) {
                                            case 0:
                                                kVar.y.setValue(str34);
                                                break;
                                            case 1:
                                                kVar.y.setValue(str34);
                                                break;
                                            case 2:
                                                kVar.y.setValue(str34);
                                                break;
                                            case 3:
                                                kVar.y.setValue(str34);
                                                break;
                                            case 4:
                                                kVar.y.setValue(str34);
                                                break;
                                            default:
                                                kVar.y.setValue(str34);
                                                break;
                                        }
                                        return kotlin.y.a;
                                    }
                                };
                                this.e = str;
                                this.y = null;
                                this.E = 10;
                                objP = lVar8.p(str12, r9, this);
                                if (objP == aVar2) {
                                }
                                iIntValue = ((Number) objP).intValue();
                                str11 = "EPG failed (channels saved): ";
                                aVar = aVar2;
                                com.app.mlounge.data.local.prefs.y1 y1Var15 = kVar.b;
                                this.e = str;
                                this.y = null;
                                this.z = null;
                                this.A = null;
                                this.B = null;
                                this.C = iIntValue;
                                this.E = 11;
                                objS = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var15.a), new androidx.compose.foundation.gestures.d1(iIntValue, null, 1, false), this);
                                if (objS == aVar) {
                                    objS = yVar;
                                }
                                if (objS == aVar) {
                                    return aVar;
                                }
                                com.app.mlounge.data.local.prefs.y1 y1Var16 = kVar.b;
                                long jCurrentTimeMillis3 = System.currentTimeMillis();
                                this.e = str;
                                this.C = iIntValue;
                                this.E = 12;
                                str13 = str;
                                objS2 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var16.a), new c2(jCurrentTimeMillis3, null, 1), this);
                                if (objS2 != aVar) {
                                    objS2 = yVar;
                                }
                                if (objS2 == aVar) {
                                    return aVar;
                                }
                                str14 = str13;
                                if (kotlin.jvm.internal.l.a(str14, "m3u")) {
                                    Flow flowA3 = kVar.b.a();
                                    this.e = null;
                                    this.C = iIntValue;
                                    this.D = 0;
                                    this.E = 13;
                                    objFirst10 = FlowKt.first(flowA3, this);
                                    if (objFirst10 == aVar) {
                                        return aVar;
                                    }
                                    i3 = iIntValue;
                                    i4 = 0;
                                    str15 = (String) objFirst10;
                                    if (!kotlin.text.k.d0(str15)) {
                                        try {
                                            kVar.y.setValue("Downloading EPG...");
                                            lVar = kVar.c;
                                            final int i110 = 3;
                                            lVar2 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                                @Override // kotlin.jvm.functions.l
                                                public final Object invoke(Object obj2) {
                                                    String str34 = (String) obj2;
                                                    switch (i110) {
                                                        case 0:
                                                            kVar.y.setValue(str34);
                                                            break;
                                                        case 1:
                                                            kVar.y.setValue(str34);
                                                            break;
                                                        case 2:
                                                            kVar.y.setValue(str34);
                                                            break;
                                                        case 3:
                                                            kVar.y.setValue(str34);
                                                            break;
                                                        case 4:
                                                            kVar.y.setValue(str34);
                                                            break;
                                                        default:
                                                            kVar.y.setValue(str34);
                                                            break;
                                                    }
                                                    return kotlin.y.a;
                                                }
                                            };
                                            this.e = null;
                                            this.y = null;
                                            this.C = i3;
                                            this.D = i4;
                                            this.E = 14;
                                            lVar.getClass();
                                            if (BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.iptv.b(lVar2, str15, lVar, null), this) == aVar) {
                                                return aVar;
                                            }
                                            i6 = i3;
                                            i2 = i10;
                                        } catch (Exception e) {
                                            e = e;
                                            i5 = i4;
                                            kVar.y.setValue(str11 + e.getMessage());
                                            i2 = i5;
                                            i6 = i3;
                                        }
                                        com.app.mlounge.data.local.prefs.y1 y1Var17 = kVar.b;
                                        if (i2 != 0) {
                                            z = i10;
                                        } else {
                                            z = 0;
                                        }
                                        this.e = null;
                                        this.y = null;
                                        this.z = null;
                                        this.A = null;
                                        this.B = null;
                                        this.C = i6;
                                        this.D = i2;
                                        this.E = 23;
                                        objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var17.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                                        if (objS3 == aVar) {
                                            objS3 = yVar;
                                        }
                                        if (objS3 == aVar) {
                                            return aVar;
                                        }
                                        MutableStateFlow mutableStateFlow11 = kVar.y;
                                        if (i2 != 0) {
                                            str27 = " + EPG";
                                        } else {
                                            str27 = "";
                                        }
                                        mutableStateFlow11.setValue("Done! " + i6 + " channels" + str27);
                                        return yVar;
                                    }
                                    i2 = i4;
                                    i6 = i3;
                                    com.app.mlounge.data.local.prefs.y1 y1Var18 = kVar.b;
                                    if (i2 != 0) {
                                        z = i10;
                                    } else {
                                        z = 0;
                                    }
                                    this.e = null;
                                    this.y = null;
                                    this.z = null;
                                    this.A = null;
                                    this.B = null;
                                    this.C = i6;
                                    this.D = i2;
                                    this.E = 23;
                                    objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var18.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                                    if (objS3 == aVar) {
                                        objS3 = yVar;
                                    }
                                    if (objS3 == aVar) {
                                        return aVar;
                                    }
                                    MutableStateFlow mutableStateFlow12 = kVar.y;
                                    if (i2 != 0) {
                                        str27 = " + EPG";
                                    } else {
                                        str27 = "";
                                    }
                                    mutableStateFlow12.setValue("Done! " + i6 + " channels" + str27);
                                    return yVar;
                                }
                                if (kotlin.jvm.internal.l.a(str14, "local")) {
                                    Flow flowB3 = kVar.b.b();
                                    this.e = null;
                                    this.C = iIntValue;
                                    this.D = 0;
                                    this.E = 15;
                                    objFirst9 = FlowKt.first(flowB3, this);
                                    if (objFirst9 == aVar) {
                                        return aVar;
                                    }
                                    i3 = iIntValue;
                                    i4 = 0;
                                    str16 = (String) objFirst9;
                                    if (!kotlin.text.k.d0(str16)) {
                                        try {
                                            kVar.y.setValue("Syncing local EPG...");
                                            lVar3 = kVar.c;
                                            final int i111 = 4;
                                            r3 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                                @Override // kotlin.jvm.functions.l
                                                public final Object invoke(Object obj2) {
                                                    String str34 = (String) obj2;
                                                    switch (i111) {
                                                        case 0:
                                                            kVar.y.setValue(str34);
                                                            break;
                                                        case 1:
                                                            kVar.y.setValue(str34);
                                                            break;
                                                        case 2:
                                                            kVar.y.setValue(str34);
                                                            break;
                                                        case 3:
                                                            kVar.y.setValue(str34);
                                                            break;
                                                        case 4:
                                                            kVar.y.setValue(str34);
                                                            break;
                                                        default:
                                                            kVar.y.setValue(str34);
                                                            break;
                                                    }
                                                    return kotlin.y.a;
                                                }
                                            };
                                            this.e = null;
                                            this.y = null;
                                            this.C = i3;
                                            this.D = i4;
                                            this.E = 16;
                                            if (lVar3.o(str16, r3, this) == aVar) {
                                                return aVar;
                                            }
                                            i6 = i3;
                                            i2 = i10;
                                        } catch (Exception e2) {
                                            e = e2;
                                            i5 = i4;
                                            kVar.y.setValue(str11 + e.getMessage());
                                            i2 = i5;
                                            i6 = i3;
                                        }
                                        com.app.mlounge.data.local.prefs.y1 y1Var19 = kVar.b;
                                        if (i2 != 0) {
                                            z = i10;
                                        } else {
                                            z = 0;
                                        }
                                        this.e = null;
                                        this.y = null;
                                        this.z = null;
                                        this.A = null;
                                        this.B = null;
                                        this.C = i6;
                                        this.D = i2;
                                        this.E = 23;
                                        objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var19.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                                        if (objS3 == aVar) {
                                            objS3 = yVar;
                                        }
                                        if (objS3 == aVar) {
                                            return aVar;
                                        }
                                        MutableStateFlow mutableStateFlow13 = kVar.y;
                                        if (i2 != 0) {
                                            str27 = " + EPG";
                                        } else {
                                            str27 = "";
                                        }
                                        mutableStateFlow13.setValue("Done! " + i6 + " channels" + str27);
                                        return yVar;
                                    }
                                    i2 = i4;
                                    i6 = i3;
                                    com.app.mlounge.data.local.prefs.y1 y1Var110 = kVar.b;
                                    if (i2 != 0) {
                                        z = i10;
                                    } else {
                                        z = 0;
                                    }
                                    this.e = null;
                                    this.y = null;
                                    this.z = null;
                                    this.A = null;
                                    this.B = null;
                                    this.C = i6;
                                    this.D = i2;
                                    this.E = 23;
                                    objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var110.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                                    if (objS3 == aVar) {
                                        objS3 = yVar;
                                    }
                                    if (objS3 == aVar) {
                                        return aVar;
                                    }
                                    MutableStateFlow mutableStateFlow14 = kVar.y;
                                    if (i2 != 0) {
                                        str27 = " + EPG";
                                    } else {
                                        str27 = "";
                                    }
                                    mutableStateFlow14.setValue("Done! " + i6 + " channels" + str27);
                                    return yVar;
                                }
                                Flow flow13 = kVar.b.Y;
                                this.e = null;
                                this.C = iIntValue;
                                this.D = 0;
                                this.E = 17;
                                objFirst8 = FlowKt.first(flow13, this);
                                if (objFirst8 == aVar) {
                                    return aVar;
                                }
                                i = iIntValue;
                                i2 = 0;
                                str17 = (String) objFirst8;
                                Flow flow14 = kVar.b.Z;
                                this.e = null;
                                this.y = str17;
                                this.C = i;
                                this.D = i2;
                                this.E = 18;
                                objFirst11 = FlowKt.first(flow14, this);
                                if (objFirst11 == aVar) {
                                    return aVar;
                                }
                                str18 = str17;
                                i7 = i;
                                str19 = (String) objFirst11;
                                Flow flow15 = kVar.b.a0;
                                this.e = null;
                                this.y = str18;
                                this.z = str19;
                                this.C = i7;
                                this.D = i2;
                                this.E = 19;
                                objFirst12 = FlowKt.first(flow15, this);
                                if (objFirst12 == aVar) {
                                    return aVar;
                                }
                                str20 = (String) objFirst12;
                                Flow flow16 = kVar.b.b0;
                                this.e = null;
                                this.y = str18;
                                this.z = str19;
                                this.A = str20;
                                this.C = i7;
                                this.D = i2;
                                this.E = 20;
                                objFirst13 = FlowKt.first(flow16, this);
                                if (objFirst13 == aVar) {
                                    return aVar;
                                }
                                str21 = str18;
                                str22 = str20;
                                str23 = (String) objFirst13;
                                Flow flowF3 = kVar.b.f();
                                this.e = null;
                                this.y = str21;
                                this.z = str19;
                                this.A = str22;
                                this.B = str23;
                                this.C = i7;
                                this.D = i2;
                                this.E = 21;
                                objFirst14 = FlowKt.first(flowF3, this);
                                if (objFirst14 == aVar) {
                                    return aVar;
                                }
                                String str34 = str21;
                                i8 = i7;
                                str24 = str34;
                                String str35 = str22;
                                str25 = str23;
                                str26 = str35;
                                if (((Boolean) objFirst14).booleanValue()) {
                                    kVar.y.setValue("Trying built-in EPG feed...");
                                    com.app.mlounge.data.iptv.l lVar9 = kVar.c;
                                    if (kotlin.text.k.d0(str19)) {
                                        str19 = null;
                                    }
                                    final int i112 = 5;
                                    ?? r10 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                        @Override // kotlin.jvm.functions.l
                                        public final Object invoke(Object obj2) {
                                            String str36 = (String) obj2;
                                            switch (i112) {
                                                case 0:
                                                    kVar.y.setValue(str36);
                                                    break;
                                                case 1:
                                                    kVar.y.setValue(str36);
                                                    break;
                                                case 2:
                                                    kVar.y.setValue(str36);
                                                    break;
                                                case 3:
                                                    kVar.y.setValue(str36);
                                                    break;
                                                case 4:
                                                    kVar.y.setValue(str36);
                                                    break;
                                                default:
                                                    kVar.y.setValue(str36);
                                                    break;
                                            }
                                            return kotlin.y.a;
                                        }
                                    };
                                    this.e = null;
                                    this.y = null;
                                    this.z = null;
                                    this.A = null;
                                    this.B = null;
                                    this.C = i8;
                                    this.D = i2;
                                    this.E = 22;
                                    objK = lVar9.k(str24, str19, str26, str25, r10, this);
                                    if (objK == aVar) {
                                        return aVar;
                                    }
                                    i2 = !((Map) objK).isEmpty() ? 1 : 0;
                                }
                                i6 = i8;
                                com.app.mlounge.data.local.prefs.y1 y1Var111 = kVar.b;
                                if (i2 != 0) {
                                    z = i10;
                                } else {
                                    z = 0;
                                }
                                this.e = null;
                                this.y = null;
                                this.z = null;
                                this.A = null;
                                this.B = null;
                                this.C = i6;
                                this.D = i2;
                                this.E = 23;
                                objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var111.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                                if (objS3 == aVar) {
                                    objS3 = yVar;
                                }
                                if (objS3 == aVar) {
                                    return aVar;
                                }
                                MutableStateFlow mutableStateFlow15 = kVar.y;
                                if (i2 != 0) {
                                    str27 = " + EPG";
                                } else {
                                    str27 = "";
                                }
                                mutableStateFlow15.setValue("Done! " + i6 + " channels" + str27);
                                return yVar;
                            }
                        }
                        throw new Exception("Unknown type: ".concat(str));
                    }
                    return aVar2;
                case 1:
                    kotlin.a.e(obj);
                    objFirst = obj;
                    str = (String) objFirst;
                    iHashCode = str.hashCode();
                    if (iHashCode != -748844389) {
                        if (str.equals("xtream")) {
                            Flow flow17 = kVar.b.Y;
                            this.e = str;
                            this.E = 4;
                            objFirst2 = FlowKt.first(flow17, this);
                            if (objFirst2 == aVar2) {
                                str3 = (String) objFirst2;
                                Flow flow18 = kVar.b.Z;
                                this.e = str;
                                this.y = str3;
                                this.E = 5;
                                objFirst5 = FlowKt.first(flow18, this);
                                if (objFirst5 != aVar2) {
                                    str4 = (String) objFirst5;
                                    Flow flow19 = kVar.b.a0;
                                    this.e = str;
                                    this.y = str3;
                                    this.z = str4;
                                    this.E = 6;
                                    objFirst6 = FlowKt.first(flow19, this);
                                    if (objFirst6 == aVar2) {
                                        str5 = str;
                                        str6 = str4;
                                        str7 = (String) objFirst6;
                                        Flow flow20 = kVar.b.b0;
                                        this.e = str5;
                                        this.y = str3;
                                        this.z = str6;
                                        this.A = str7;
                                        this.E = 7;
                                        objFirst7 = FlowKt.first(flow20, this);
                                        if (objFirst7 == aVar2) {
                                            str8 = str5;
                                            str9 = str3;
                                            str10 = str7;
                                            String str210 = (String) objFirst7;
                                            if (kotlin.text.k.d0(str9)) {
                                                break;
                                            }
                                            throw new Exception("Host, username, and password are required");
                                        }
                                    }
                                }
                            }
                            return aVar2;
                        }
                        throw new Exception("Unknown type: ".concat(str));
                    }
                    if (iHashCode == 106447) {
                        if (iHashCode == 103145323) {
                            Flow flowC2 = kVar.b.c();
                            this.e = str;
                            this.E = 9;
                            objFirst4 = FlowKt.first(flowC2, this);
                            if (objFirst4 == aVar2) {
                                str12 = (String) objFirst4;
                                if (kotlin.text.k.d0(str12)) {
                                    throw new Exception("Local M3U file is required");
                                }
                                com.app.mlounge.data.iptv.l lVar10 = kVar.c;
                                final int i113 = 2;
                                ?? r11 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                    @Override // kotlin.jvm.functions.l
                                    public final Object invoke(Object obj2) {
                                        String str36 = (String) obj2;
                                        switch (i113) {
                                            case 0:
                                                kVar.y.setValue(str36);
                                                break;
                                            case 1:
                                                kVar.y.setValue(str36);
                                                break;
                                            case 2:
                                                kVar.y.setValue(str36);
                                                break;
                                            case 3:
                                                kVar.y.setValue(str36);
                                                break;
                                            case 4:
                                                kVar.y.setValue(str36);
                                                break;
                                            default:
                                                kVar.y.setValue(str36);
                                                break;
                                        }
                                        return kotlin.y.a;
                                    }
                                };
                                this.e = str;
                                this.y = null;
                                this.E = 10;
                                objP = lVar10.p(str12, r11, this);
                                if (objP == aVar2) {
                                }
                                iIntValue = ((Number) objP).intValue();
                                str11 = "EPG failed (channels saved): ";
                                aVar = aVar2;
                                com.app.mlounge.data.local.prefs.y1 y1Var112 = kVar.b;
                                this.e = str;
                                this.y = null;
                                this.z = null;
                                this.A = null;
                                this.B = null;
                                this.C = iIntValue;
                                this.E = 11;
                                objS = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var112.a), new androidx.compose.foundation.gestures.d1(iIntValue, null, 1, false), this);
                                if (objS == aVar) {
                                    objS = yVar;
                                }
                                if (objS == aVar) {
                                    return aVar;
                                }
                                com.app.mlounge.data.local.prefs.y1 y1Var113 = kVar.b;
                                long jCurrentTimeMillis4 = System.currentTimeMillis();
                                this.e = str;
                                this.C = iIntValue;
                                this.E = 12;
                                str13 = str;
                                objS2 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var113.a), new c2(jCurrentTimeMillis4, null, 1), this);
                                if (objS2 != aVar) {
                                    objS2 = yVar;
                                }
                                if (objS2 == aVar) {
                                    return aVar;
                                }
                                str14 = str13;
                                if (kotlin.jvm.internal.l.a(str14, "m3u")) {
                                    Flow flowA4 = kVar.b.a();
                                    this.e = null;
                                    this.C = iIntValue;
                                    this.D = 0;
                                    this.E = 13;
                                    objFirst10 = FlowKt.first(flowA4, this);
                                    if (objFirst10 == aVar) {
                                        return aVar;
                                    }
                                    i3 = iIntValue;
                                    i4 = 0;
                                    str15 = (String) objFirst10;
                                    if (!kotlin.text.k.d0(str15)) {
                                        kVar.y.setValue("Downloading EPG...");
                                        lVar = kVar.c;
                                        final int i114 = 3;
                                        lVar2 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                            @Override // kotlin.jvm.functions.l
                                            public final Object invoke(Object obj2) {
                                                String str36 = (String) obj2;
                                                switch (i114) {
                                                    case 0:
                                                        kVar.y.setValue(str36);
                                                        break;
                                                    case 1:
                                                        kVar.y.setValue(str36);
                                                        break;
                                                    case 2:
                                                        kVar.y.setValue(str36);
                                                        break;
                                                    case 3:
                                                        kVar.y.setValue(str36);
                                                        break;
                                                    case 4:
                                                        kVar.y.setValue(str36);
                                                        break;
                                                    default:
                                                        kVar.y.setValue(str36);
                                                        break;
                                                }
                                                return kotlin.y.a;
                                            }
                                        };
                                        this.e = null;
                                        this.y = null;
                                        this.C = i3;
                                        this.D = i4;
                                        this.E = 14;
                                        lVar.getClass();
                                        if (BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.iptv.b(lVar2, str15, lVar, null), this) == aVar) {
                                            return aVar;
                                        }
                                        i6 = i3;
                                        i2 = i10;
                                        com.app.mlounge.data.local.prefs.y1 y1Var114 = kVar.b;
                                        if (i2 != 0) {
                                            z = i10;
                                        } else {
                                            z = 0;
                                        }
                                        this.e = null;
                                        this.y = null;
                                        this.z = null;
                                        this.A = null;
                                        this.B = null;
                                        this.C = i6;
                                        this.D = i2;
                                        this.E = 23;
                                        objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var114.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                                        if (objS3 == aVar) {
                                            objS3 = yVar;
                                        }
                                        if (objS3 == aVar) {
                                            return aVar;
                                        }
                                        MutableStateFlow mutableStateFlow16 = kVar.y;
                                        if (i2 != 0) {
                                            str27 = " + EPG";
                                        } else {
                                            str27 = "";
                                        }
                                        mutableStateFlow16.setValue("Done! " + i6 + " channels" + str27);
                                        return yVar;
                                    }
                                    i2 = i4;
                                    i6 = i3;
                                    com.app.mlounge.data.local.prefs.y1 y1Var115 = kVar.b;
                                    if (i2 != 0) {
                                        z = i10;
                                    } else {
                                        z = 0;
                                    }
                                    this.e = null;
                                    this.y = null;
                                    this.z = null;
                                    this.A = null;
                                    this.B = null;
                                    this.C = i6;
                                    this.D = i2;
                                    this.E = 23;
                                    objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var115.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                                    if (objS3 == aVar) {
                                        objS3 = yVar;
                                    }
                                    if (objS3 == aVar) {
                                        return aVar;
                                    }
                                    MutableStateFlow mutableStateFlow17 = kVar.y;
                                    if (i2 != 0) {
                                        str27 = " + EPG";
                                    } else {
                                        str27 = "";
                                    }
                                    mutableStateFlow17.setValue("Done! " + i6 + " channels" + str27);
                                    return yVar;
                                }
                                if (kotlin.jvm.internal.l.a(str14, "local")) {
                                    Flow flowB4 = kVar.b.b();
                                    this.e = null;
                                    this.C = iIntValue;
                                    this.D = 0;
                                    this.E = 15;
                                    objFirst9 = FlowKt.first(flowB4, this);
                                    if (objFirst9 == aVar) {
                                        return aVar;
                                    }
                                    i3 = iIntValue;
                                    i4 = 0;
                                    str16 = (String) objFirst9;
                                    if (!kotlin.text.k.d0(str16)) {
                                        kVar.y.setValue("Syncing local EPG...");
                                        lVar3 = kVar.c;
                                        final int i115 = 4;
                                        r3 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                            @Override // kotlin.jvm.functions.l
                                            public final Object invoke(Object obj2) {
                                                String str36 = (String) obj2;
                                                switch (i115) {
                                                    case 0:
                                                        kVar.y.setValue(str36);
                                                        break;
                                                    case 1:
                                                        kVar.y.setValue(str36);
                                                        break;
                                                    case 2:
                                                        kVar.y.setValue(str36);
                                                        break;
                                                    case 3:
                                                        kVar.y.setValue(str36);
                                                        break;
                                                    case 4:
                                                        kVar.y.setValue(str36);
                                                        break;
                                                    default:
                                                        kVar.y.setValue(str36);
                                                        break;
                                                }
                                                return kotlin.y.a;
                                            }
                                        };
                                        this.e = null;
                                        this.y = null;
                                        this.C = i3;
                                        this.D = i4;
                                        this.E = 16;
                                        if (lVar3.o(str16, r3, this) == aVar) {
                                            return aVar;
                                        }
                                        i6 = i3;
                                        i2 = i10;
                                        com.app.mlounge.data.local.prefs.y1 y1Var116 = kVar.b;
                                        if (i2 != 0) {
                                            z = i10;
                                        } else {
                                            z = 0;
                                        }
                                        this.e = null;
                                        this.y = null;
                                        this.z = null;
                                        this.A = null;
                                        this.B = null;
                                        this.C = i6;
                                        this.D = i2;
                                        this.E = 23;
                                        objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var116.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                                        if (objS3 == aVar) {
                                            objS3 = yVar;
                                        }
                                        if (objS3 == aVar) {
                                            return aVar;
                                        }
                                        MutableStateFlow mutableStateFlow18 = kVar.y;
                                        if (i2 != 0) {
                                            str27 = " + EPG";
                                        } else {
                                            str27 = "";
                                        }
                                        mutableStateFlow18.setValue("Done! " + i6 + " channels" + str27);
                                        return yVar;
                                    }
                                    i2 = i4;
                                    i6 = i3;
                                    com.app.mlounge.data.local.prefs.y1 y1Var117 = kVar.b;
                                    if (i2 != 0) {
                                        z = i10;
                                    } else {
                                        z = 0;
                                    }
                                    this.e = null;
                                    this.y = null;
                                    this.z = null;
                                    this.A = null;
                                    this.B = null;
                                    this.C = i6;
                                    this.D = i2;
                                    this.E = 23;
                                    objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var117.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                                    if (objS3 == aVar) {
                                        objS3 = yVar;
                                    }
                                    if (objS3 == aVar) {
                                        return aVar;
                                    }
                                    MutableStateFlow mutableStateFlow19 = kVar.y;
                                    if (i2 != 0) {
                                        str27 = " + EPG";
                                    } else {
                                        str27 = "";
                                    }
                                    mutableStateFlow19.setValue("Done! " + i6 + " channels" + str27);
                                    return yVar;
                                }
                                Flow flow110 = kVar.b.Y;
                                this.e = null;
                                this.C = iIntValue;
                                this.D = 0;
                                this.E = 17;
                                objFirst8 = FlowKt.first(flow110, this);
                                if (objFirst8 == aVar) {
                                    return aVar;
                                }
                                i = iIntValue;
                                i2 = 0;
                                str17 = (String) objFirst8;
                                Flow flow111 = kVar.b.Z;
                                this.e = null;
                                this.y = str17;
                                this.C = i;
                                this.D = i2;
                                this.E = 18;
                                objFirst11 = FlowKt.first(flow111, this);
                                if (objFirst11 == aVar) {
                                    return aVar;
                                }
                                str18 = str17;
                                i7 = i;
                                str19 = (String) objFirst11;
                                Flow flow112 = kVar.b.a0;
                                this.e = null;
                                this.y = str18;
                                this.z = str19;
                                this.C = i7;
                                this.D = i2;
                                this.E = 19;
                                objFirst12 = FlowKt.first(flow112, this);
                                if (objFirst12 == aVar) {
                                    return aVar;
                                }
                                str20 = (String) objFirst12;
                                Flow flow113 = kVar.b.b0;
                                this.e = null;
                                this.y = str18;
                                this.z = str19;
                                this.A = str20;
                                this.C = i7;
                                this.D = i2;
                                this.E = 20;
                                objFirst13 = FlowKt.first(flow113, this);
                                if (objFirst13 == aVar) {
                                    return aVar;
                                }
                                str21 = str18;
                                str22 = str20;
                                str23 = (String) objFirst13;
                                Flow flowF4 = kVar.b.f();
                                this.e = null;
                                this.y = str21;
                                this.z = str19;
                                this.A = str22;
                                this.B = str23;
                                this.C = i7;
                                this.D = i2;
                                this.E = 21;
                                objFirst14 = FlowKt.first(flowF4, this);
                                if (objFirst14 == aVar) {
                                    return aVar;
                                }
                                String str36 = str21;
                                i8 = i7;
                                str24 = str36;
                                String str37 = str22;
                                str25 = str23;
                                str26 = str37;
                                if (((Boolean) objFirst14).booleanValue()) {
                                    kVar.y.setValue("Trying built-in EPG feed...");
                                    com.app.mlounge.data.iptv.l lVar11 = kVar.c;
                                    if (kotlin.text.k.d0(str19)) {
                                        str19 = null;
                                    }
                                    final int i116 = 5;
                                    ?? r12 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                        @Override // kotlin.jvm.functions.l
                                        public final Object invoke(Object obj2) {
                                            String str38 = (String) obj2;
                                            switch (i116) {
                                                case 0:
                                                    kVar.y.setValue(str38);
                                                    break;
                                                case 1:
                                                    kVar.y.setValue(str38);
                                                    break;
                                                case 2:
                                                    kVar.y.setValue(str38);
                                                    break;
                                                case 3:
                                                    kVar.y.setValue(str38);
                                                    break;
                                                case 4:
                                                    kVar.y.setValue(str38);
                                                    break;
                                                default:
                                                    kVar.y.setValue(str38);
                                                    break;
                                            }
                                            return kotlin.y.a;
                                        }
                                    };
                                    this.e = null;
                                    this.y = null;
                                    this.z = null;
                                    this.A = null;
                                    this.B = null;
                                    this.C = i8;
                                    this.D = i2;
                                    this.E = 22;
                                    objK = lVar11.k(str24, str19, str26, str25, r12, this);
                                    if (objK == aVar) {
                                        return aVar;
                                    }
                                    i2 = !((Map) objK).isEmpty() ? 1 : 0;
                                }
                                i6 = i8;
                                com.app.mlounge.data.local.prefs.y1 y1Var118 = kVar.b;
                                if (i2 != 0) {
                                    z = i10;
                                } else {
                                    z = 0;
                                }
                                this.e = null;
                                this.y = null;
                                this.z = null;
                                this.A = null;
                                this.B = null;
                                this.C = i6;
                                this.D = i2;
                                this.E = 23;
                                objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var118.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                                if (objS3 == aVar) {
                                    objS3 = yVar;
                                }
                                if (objS3 == aVar) {
                                    return aVar;
                                }
                                MutableStateFlow mutableStateFlow110 = kVar.y;
                                if (i2 != 0) {
                                    str27 = " + EPG";
                                } else {
                                    str27 = "";
                                }
                                mutableStateFlow110.setValue("Done! " + i6 + " channels" + str27);
                                return yVar;
                            }
                            return aVar2;
                        }
                        throw new Exception("Unknown type: ".concat(str));
                    }
                    if (str.equals("m3u")) {
                        Flow flowD2 = kVar.b.d();
                        this.e = str;
                        this.E = 2;
                        objFirst3 = FlowKt.first(flowD2, this);
                        if (objFirst3 == aVar2) {
                            str2 = (String) objFirst3;
                            if (kotlin.text.k.d0(str2)) {
                                throw new Exception("M3U URL is required");
                            }
                            com.app.mlounge.data.iptv.l lVar12 = kVar.c;
                            final int i117 = 0;
                            ?? r13 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                @Override // kotlin.jvm.functions.l
                                public final Object invoke(Object obj2) {
                                    String str38 = (String) obj2;
                                    switch (i117) {
                                        case 0:
                                            kVar.y.setValue(str38);
                                            break;
                                        case 1:
                                            kVar.y.setValue(str38);
                                            break;
                                        case 2:
                                            kVar.y.setValue(str38);
                                            break;
                                        case 3:
                                            kVar.y.setValue(str38);
                                            break;
                                        case 4:
                                            kVar.y.setValue(str38);
                                            break;
                                        default:
                                            kVar.y.setValue(str38);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            this.e = str;
                            this.y = null;
                            this.E = 3;
                            objI = lVar12.i(str2, r13, this);
                            if (objI == aVar2) {
                            }
                            iIntValue = ((Number) objI).intValue();
                            str11 = "EPG failed (channels saved): ";
                            aVar = aVar2;
                            com.app.mlounge.data.local.prefs.y1 y1Var119 = kVar.b;
                            this.e = str;
                            this.y = null;
                            this.z = null;
                            this.A = null;
                            this.B = null;
                            this.C = iIntValue;
                            this.E = 11;
                            objS = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var119.a), new androidx.compose.foundation.gestures.d1(iIntValue, null, 1, false), this);
                            if (objS == aVar) {
                                objS = yVar;
                            }
                            if (objS == aVar) {
                                return aVar;
                            }
                            com.app.mlounge.data.local.prefs.y1 y1Var1110 = kVar.b;
                            long jCurrentTimeMillis5 = System.currentTimeMillis();
                            this.e = str;
                            this.C = iIntValue;
                            this.E = 12;
                            str13 = str;
                            objS2 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var1110.a), new c2(jCurrentTimeMillis5, null, 1), this);
                            if (objS2 != aVar) {
                                objS2 = yVar;
                            }
                            if (objS2 == aVar) {
                                return aVar;
                            }
                            str14 = str13;
                            if (kotlin.jvm.internal.l.a(str14, "m3u")) {
                                Flow flowA5 = kVar.b.a();
                                this.e = null;
                                this.C = iIntValue;
                                this.D = 0;
                                this.E = 13;
                                objFirst10 = FlowKt.first(flowA5, this);
                                if (objFirst10 == aVar) {
                                    return aVar;
                                }
                                i3 = iIntValue;
                                i4 = 0;
                                str15 = (String) objFirst10;
                                if (!kotlin.text.k.d0(str15)) {
                                    kVar.y.setValue("Downloading EPG...");
                                    lVar = kVar.c;
                                    final int i118 = 3;
                                    lVar2 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                        @Override // kotlin.jvm.functions.l
                                        public final Object invoke(Object obj2) {
                                            String str38 = (String) obj2;
                                            switch (i118) {
                                                case 0:
                                                    kVar.y.setValue(str38);
                                                    break;
                                                case 1:
                                                    kVar.y.setValue(str38);
                                                    break;
                                                case 2:
                                                    kVar.y.setValue(str38);
                                                    break;
                                                case 3:
                                                    kVar.y.setValue(str38);
                                                    break;
                                                case 4:
                                                    kVar.y.setValue(str38);
                                                    break;
                                                default:
                                                    kVar.y.setValue(str38);
                                                    break;
                                            }
                                            return kotlin.y.a;
                                        }
                                    };
                                    this.e = null;
                                    this.y = null;
                                    this.C = i3;
                                    this.D = i4;
                                    this.E = 14;
                                    lVar.getClass();
                                    if (BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.iptv.b(lVar2, str15, lVar, null), this) == aVar) {
                                        return aVar;
                                    }
                                    i6 = i3;
                                    i2 = i10;
                                    com.app.mlounge.data.local.prefs.y1 y1Var1111 = kVar.b;
                                    if (i2 != 0) {
                                        z = i10;
                                    } else {
                                        z = 0;
                                    }
                                    this.e = null;
                                    this.y = null;
                                    this.z = null;
                                    this.A = null;
                                    this.B = null;
                                    this.C = i6;
                                    this.D = i2;
                                    this.E = 23;
                                    objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var1111.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                                    if (objS3 == aVar) {
                                        objS3 = yVar;
                                    }
                                    if (objS3 == aVar) {
                                        return aVar;
                                    }
                                    MutableStateFlow mutableStateFlow111 = kVar.y;
                                    if (i2 != 0) {
                                        str27 = " + EPG";
                                    } else {
                                        str27 = "";
                                    }
                                    mutableStateFlow111.setValue("Done! " + i6 + " channels" + str27);
                                    return yVar;
                                }
                                i2 = i4;
                                i6 = i3;
                                com.app.mlounge.data.local.prefs.y1 y1Var1112 = kVar.b;
                                if (i2 != 0) {
                                    z = i10;
                                } else {
                                    z = 0;
                                }
                                this.e = null;
                                this.y = null;
                                this.z = null;
                                this.A = null;
                                this.B = null;
                                this.C = i6;
                                this.D = i2;
                                this.E = 23;
                                objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var1112.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                                if (objS3 == aVar) {
                                    objS3 = yVar;
                                }
                                if (objS3 == aVar) {
                                    return aVar;
                                }
                                MutableStateFlow mutableStateFlow112 = kVar.y;
                                if (i2 != 0) {
                                    str27 = " + EPG";
                                } else {
                                    str27 = "";
                                }
                                mutableStateFlow112.setValue("Done! " + i6 + " channels" + str27);
                                return yVar;
                            }
                            if (kotlin.jvm.internal.l.a(str14, "local")) {
                                Flow flowB5 = kVar.b.b();
                                this.e = null;
                                this.C = iIntValue;
                                this.D = 0;
                                this.E = 15;
                                objFirst9 = FlowKt.first(flowB5, this);
                                if (objFirst9 == aVar) {
                                    return aVar;
                                }
                                i3 = iIntValue;
                                i4 = 0;
                                str16 = (String) objFirst9;
                                if (!kotlin.text.k.d0(str16)) {
                                    kVar.y.setValue("Syncing local EPG...");
                                    lVar3 = kVar.c;
                                    final int i119 = 4;
                                    r3 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                        @Override // kotlin.jvm.functions.l
                                        public final Object invoke(Object obj2) {
                                            String str38 = (String) obj2;
                                            switch (i119) {
                                                case 0:
                                                    kVar.y.setValue(str38);
                                                    break;
                                                case 1:
                                                    kVar.y.setValue(str38);
                                                    break;
                                                case 2:
                                                    kVar.y.setValue(str38);
                                                    break;
                                                case 3:
                                                    kVar.y.setValue(str38);
                                                    break;
                                                case 4:
                                                    kVar.y.setValue(str38);
                                                    break;
                                                default:
                                                    kVar.y.setValue(str38);
                                                    break;
                                            }
                                            return kotlin.y.a;
                                        }
                                    };
                                    this.e = null;
                                    this.y = null;
                                    this.C = i3;
                                    this.D = i4;
                                    this.E = 16;
                                    if (lVar3.o(str16, r3, this) == aVar) {
                                        return aVar;
                                    }
                                    i6 = i3;
                                    i2 = i10;
                                    com.app.mlounge.data.local.prefs.y1 y1Var1113 = kVar.b;
                                    if (i2 != 0) {
                                        z = i10;
                                    } else {
                                        z = 0;
                                    }
                                    this.e = null;
                                    this.y = null;
                                    this.z = null;
                                    this.A = null;
                                    this.B = null;
                                    this.C = i6;
                                    this.D = i2;
                                    this.E = 23;
                                    objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var1113.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                                    if (objS3 == aVar) {
                                        objS3 = yVar;
                                    }
                                    if (objS3 == aVar) {
                                        return aVar;
                                    }
                                    MutableStateFlow mutableStateFlow113 = kVar.y;
                                    if (i2 != 0) {
                                        str27 = " + EPG";
                                    } else {
                                        str27 = "";
                                    }
                                    mutableStateFlow113.setValue("Done! " + i6 + " channels" + str27);
                                    return yVar;
                                }
                                i2 = i4;
                                i6 = i3;
                                com.app.mlounge.data.local.prefs.y1 y1Var1114 = kVar.b;
                                if (i2 != 0) {
                                    z = i10;
                                } else {
                                    z = 0;
                                }
                                this.e = null;
                                this.y = null;
                                this.z = null;
                                this.A = null;
                                this.B = null;
                                this.C = i6;
                                this.D = i2;
                                this.E = 23;
                                objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var1114.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                                if (objS3 == aVar) {
                                    objS3 = yVar;
                                }
                                if (objS3 == aVar) {
                                    return aVar;
                                }
                                MutableStateFlow mutableStateFlow114 = kVar.y;
                                if (i2 != 0) {
                                    str27 = " + EPG";
                                } else {
                                    str27 = "";
                                }
                                mutableStateFlow114.setValue("Done! " + i6 + " channels" + str27);
                                return yVar;
                            }
                            Flow flow114 = kVar.b.Y;
                            this.e = null;
                            this.C = iIntValue;
                            this.D = 0;
                            this.E = 17;
                            objFirst8 = FlowKt.first(flow114, this);
                            if (objFirst8 == aVar) {
                                return aVar;
                            }
                            i = iIntValue;
                            i2 = 0;
                            str17 = (String) objFirst8;
                            Flow flow115 = kVar.b.Z;
                            this.e = null;
                            this.y = str17;
                            this.C = i;
                            this.D = i2;
                            this.E = 18;
                            objFirst11 = FlowKt.first(flow115, this);
                            if (objFirst11 == aVar) {
                                return aVar;
                            }
                            str18 = str17;
                            i7 = i;
                            str19 = (String) objFirst11;
                            Flow flow116 = kVar.b.a0;
                            this.e = null;
                            this.y = str18;
                            this.z = str19;
                            this.C = i7;
                            this.D = i2;
                            this.E = 19;
                            objFirst12 = FlowKt.first(flow116, this);
                            if (objFirst12 == aVar) {
                                return aVar;
                            }
                            str20 = (String) objFirst12;
                            Flow flow117 = kVar.b.b0;
                            this.e = null;
                            this.y = str18;
                            this.z = str19;
                            this.A = str20;
                            this.C = i7;
                            this.D = i2;
                            this.E = 20;
                            objFirst13 = FlowKt.first(flow117, this);
                            if (objFirst13 == aVar) {
                                return aVar;
                            }
                            str21 = str18;
                            str22 = str20;
                            str23 = (String) objFirst13;
                            Flow flowF5 = kVar.b.f();
                            this.e = null;
                            this.y = str21;
                            this.z = str19;
                            this.A = str22;
                            this.B = str23;
                            this.C = i7;
                            this.D = i2;
                            this.E = 21;
                            objFirst14 = FlowKt.first(flowF5, this);
                            if (objFirst14 == aVar) {
                                return aVar;
                            }
                            String str38 = str21;
                            i8 = i7;
                            str24 = str38;
                            String str39 = str22;
                            str25 = str23;
                            str26 = str39;
                            if (((Boolean) objFirst14).booleanValue()) {
                                kVar.y.setValue("Trying built-in EPG feed...");
                                com.app.mlounge.data.iptv.l lVar13 = kVar.c;
                                if (kotlin.text.k.d0(str19)) {
                                    str19 = null;
                                }
                                final int i1110 = 5;
                                ?? r14 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                    @Override // kotlin.jvm.functions.l
                                    public final Object invoke(Object obj2) {
                                        String str310 = (String) obj2;
                                        switch (i1110) {
                                            case 0:
                                                kVar.y.setValue(str310);
                                                break;
                                            case 1:
                                                kVar.y.setValue(str310);
                                                break;
                                            case 2:
                                                kVar.y.setValue(str310);
                                                break;
                                            case 3:
                                                kVar.y.setValue(str310);
                                                break;
                                            case 4:
                                                kVar.y.setValue(str310);
                                                break;
                                            default:
                                                kVar.y.setValue(str310);
                                                break;
                                        }
                                        return kotlin.y.a;
                                    }
                                };
                                this.e = null;
                                this.y = null;
                                this.z = null;
                                this.A = null;
                                this.B = null;
                                this.C = i8;
                                this.D = i2;
                                this.E = 22;
                                objK = lVar13.k(str24, str19, str26, str25, r14, this);
                                if (objK == aVar) {
                                    return aVar;
                                }
                                i2 = !((Map) objK).isEmpty() ? 1 : 0;
                            }
                            i6 = i8;
                            com.app.mlounge.data.local.prefs.y1 y1Var1115 = kVar.b;
                            if (i2 != 0) {
                                z = i10;
                            } else {
                                z = 0;
                            }
                            this.e = null;
                            this.y = null;
                            this.z = null;
                            this.A = null;
                            this.B = null;
                            this.C = i6;
                            this.D = i2;
                            this.E = 23;
                            objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var1115.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                            if (objS3 == aVar) {
                                objS3 = yVar;
                            }
                            if (objS3 == aVar) {
                                return aVar;
                            }
                            MutableStateFlow mutableStateFlow115 = kVar.y;
                            if (i2 != 0) {
                                str27 = " + EPG";
                            } else {
                                str27 = "";
                            }
                            mutableStateFlow115.setValue("Done! " + i6 + " channels" + str27);
                            return yVar;
                        }
                        return aVar2;
                    }
                    throw new Exception("Unknown type: ".concat(str));
                case 2:
                    String str40 = this.e;
                    kotlin.a.e(obj);
                    str = str40;
                    objFirst3 = obj;
                    str2 = (String) objFirst3;
                    if (kotlin.text.k.d0(str2)) {
                        throw new Exception("M3U URL is required");
                    }
                    com.app.mlounge.data.iptv.l lVar14 = kVar.c;
                    final int i1111 = 0;
                    ?? r15 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                        @Override // kotlin.jvm.functions.l
                        public final Object invoke(Object obj2) {
                            String str310 = (String) obj2;
                            switch (i1111) {
                                case 0:
                                    kVar.y.setValue(str310);
                                    break;
                                case 1:
                                    kVar.y.setValue(str310);
                                    break;
                                case 2:
                                    kVar.y.setValue(str310);
                                    break;
                                case 3:
                                    kVar.y.setValue(str310);
                                    break;
                                case 4:
                                    kVar.y.setValue(str310);
                                    break;
                                default:
                                    kVar.y.setValue(str310);
                                    break;
                            }
                            return kotlin.y.a;
                        }
                    };
                    this.e = str;
                    this.y = null;
                    this.E = 3;
                    objI = lVar14.i(str2, r15, this);
                    if (objI == aVar2) {
                        return aVar2;
                    }
                    iIntValue = ((Number) objI).intValue();
                    str11 = "EPG failed (channels saved): ";
                    aVar = aVar2;
                    com.app.mlounge.data.local.prefs.y1 y1Var1116 = kVar.b;
                    this.e = str;
                    this.y = null;
                    this.z = null;
                    this.A = null;
                    this.B = null;
                    this.C = iIntValue;
                    this.E = 11;
                    objS = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var1116.a), new androidx.compose.foundation.gestures.d1(iIntValue, null, 1, false), this);
                    if (objS == aVar) {
                        objS = yVar;
                    }
                    if (objS == aVar) {
                        return aVar;
                    }
                    com.app.mlounge.data.local.prefs.y1 y1Var1117 = kVar.b;
                    long jCurrentTimeMillis6 = System.currentTimeMillis();
                    this.e = str;
                    this.C = iIntValue;
                    this.E = 12;
                    str13 = str;
                    objS2 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var1117.a), new c2(jCurrentTimeMillis6, null, 1), this);
                    if (objS2 != aVar) {
                        objS2 = yVar;
                    }
                    if (objS2 == aVar) {
                        return aVar;
                    }
                    str14 = str13;
                    if (kotlin.jvm.internal.l.a(str14, "m3u")) {
                        Flow flowA6 = kVar.b.a();
                        this.e = null;
                        this.C = iIntValue;
                        this.D = 0;
                        this.E = 13;
                        objFirst10 = FlowKt.first(flowA6, this);
                        if (objFirst10 == aVar) {
                            return aVar;
                        }
                        i3 = iIntValue;
                        i4 = 0;
                        str15 = (String) objFirst10;
                        if (!kotlin.text.k.d0(str15)) {
                            kVar.y.setValue("Downloading EPG...");
                            lVar = kVar.c;
                            final int i1112 = 3;
                            lVar2 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                @Override // kotlin.jvm.functions.l
                                public final Object invoke(Object obj2) {
                                    String str310 = (String) obj2;
                                    switch (i1112) {
                                        case 0:
                                            kVar.y.setValue(str310);
                                            break;
                                        case 1:
                                            kVar.y.setValue(str310);
                                            break;
                                        case 2:
                                            kVar.y.setValue(str310);
                                            break;
                                        case 3:
                                            kVar.y.setValue(str310);
                                            break;
                                        case 4:
                                            kVar.y.setValue(str310);
                                            break;
                                        default:
                                            kVar.y.setValue(str310);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            this.e = null;
                            this.y = null;
                            this.C = i3;
                            this.D = i4;
                            this.E = 14;
                            lVar.getClass();
                            if (BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.iptv.b(lVar2, str15, lVar, null), this) == aVar) {
                                return aVar;
                            }
                            i6 = i3;
                            i2 = i10;
                            com.app.mlounge.data.local.prefs.y1 y1Var1118 = kVar.b;
                            if (i2 != 0) {
                                z = i10;
                            } else {
                                z = 0;
                            }
                            this.e = null;
                            this.y = null;
                            this.z = null;
                            this.A = null;
                            this.B = null;
                            this.C = i6;
                            this.D = i2;
                            this.E = 23;
                            objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var1118.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                            if (objS3 == aVar) {
                                objS3 = yVar;
                            }
                            if (objS3 == aVar) {
                                return aVar;
                            }
                            MutableStateFlow mutableStateFlow116 = kVar.y;
                            if (i2 != 0) {
                                str27 = " + EPG";
                            } else {
                                str27 = "";
                            }
                            mutableStateFlow116.setValue("Done! " + i6 + " channels" + str27);
                            return yVar;
                        }
                        i2 = i4;
                        i6 = i3;
                        com.app.mlounge.data.local.prefs.y1 y1Var1119 = kVar.b;
                        if (i2 != 0) {
                            z = i10;
                        } else {
                            z = 0;
                        }
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i6;
                        this.D = i2;
                        this.E = 23;
                        objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var1119.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                        if (objS3 == aVar) {
                            objS3 = yVar;
                        }
                        if (objS3 == aVar) {
                            return aVar;
                        }
                        MutableStateFlow mutableStateFlow117 = kVar.y;
                        if (i2 != 0) {
                            str27 = " + EPG";
                        } else {
                            str27 = "";
                        }
                        mutableStateFlow117.setValue("Done! " + i6 + " channels" + str27);
                        return yVar;
                    }
                    if (kotlin.jvm.internal.l.a(str14, "local")) {
                        Flow flowB6 = kVar.b.b();
                        this.e = null;
                        this.C = iIntValue;
                        this.D = 0;
                        this.E = 15;
                        objFirst9 = FlowKt.first(flowB6, this);
                        if (objFirst9 == aVar) {
                            return aVar;
                        }
                        i3 = iIntValue;
                        i4 = 0;
                        str16 = (String) objFirst9;
                        if (!kotlin.text.k.d0(str16)) {
                            kVar.y.setValue("Syncing local EPG...");
                            lVar3 = kVar.c;
                            final int i1113 = 4;
                            r3 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                @Override // kotlin.jvm.functions.l
                                public final Object invoke(Object obj2) {
                                    String str310 = (String) obj2;
                                    switch (i1113) {
                                        case 0:
                                            kVar.y.setValue(str310);
                                            break;
                                        case 1:
                                            kVar.y.setValue(str310);
                                            break;
                                        case 2:
                                            kVar.y.setValue(str310);
                                            break;
                                        case 3:
                                            kVar.y.setValue(str310);
                                            break;
                                        case 4:
                                            kVar.y.setValue(str310);
                                            break;
                                        default:
                                            kVar.y.setValue(str310);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            this.e = null;
                            this.y = null;
                            this.C = i3;
                            this.D = i4;
                            this.E = 16;
                            if (lVar3.o(str16, r3, this) == aVar) {
                                return aVar;
                            }
                            i6 = i3;
                            i2 = i10;
                            com.app.mlounge.data.local.prefs.y1 y1Var11110 = kVar.b;
                            if (i2 != 0) {
                                z = i10;
                            } else {
                                z = 0;
                            }
                            this.e = null;
                            this.y = null;
                            this.z = null;
                            this.A = null;
                            this.B = null;
                            this.C = i6;
                            this.D = i2;
                            this.E = 23;
                            objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var11110.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                            if (objS3 == aVar) {
                                objS3 = yVar;
                            }
                            if (objS3 == aVar) {
                                return aVar;
                            }
                            MutableStateFlow mutableStateFlow118 = kVar.y;
                            if (i2 != 0) {
                                str27 = " + EPG";
                            } else {
                                str27 = "";
                            }
                            mutableStateFlow118.setValue("Done! " + i6 + " channels" + str27);
                            return yVar;
                        }
                        i2 = i4;
                        i6 = i3;
                        com.app.mlounge.data.local.prefs.y1 y1Var11111 = kVar.b;
                        if (i2 != 0) {
                            z = i10;
                        } else {
                            z = 0;
                        }
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i6;
                        this.D = i2;
                        this.E = 23;
                        objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var11111.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                        if (objS3 == aVar) {
                            objS3 = yVar;
                        }
                        if (objS3 == aVar) {
                            return aVar;
                        }
                        MutableStateFlow mutableStateFlow119 = kVar.y;
                        if (i2 != 0) {
                            str27 = " + EPG";
                        } else {
                            str27 = "";
                        }
                        mutableStateFlow119.setValue("Done! " + i6 + " channels" + str27);
                        return yVar;
                    }
                    Flow flow118 = kVar.b.Y;
                    this.e = null;
                    this.C = iIntValue;
                    this.D = 0;
                    this.E = 17;
                    objFirst8 = FlowKt.first(flow118, this);
                    if (objFirst8 == aVar) {
                        return aVar;
                    }
                    i = iIntValue;
                    i2 = 0;
                    str17 = (String) objFirst8;
                    Flow flow119 = kVar.b.Z;
                    this.e = null;
                    this.y = str17;
                    this.C = i;
                    this.D = i2;
                    this.E = 18;
                    objFirst11 = FlowKt.first(flow119, this);
                    if (objFirst11 == aVar) {
                        return aVar;
                    }
                    str18 = str17;
                    i7 = i;
                    str19 = (String) objFirst11;
                    Flow flow1110 = kVar.b.a0;
                    this.e = null;
                    this.y = str18;
                    this.z = str19;
                    this.C = i7;
                    this.D = i2;
                    this.E = 19;
                    objFirst12 = FlowKt.first(flow1110, this);
                    if (objFirst12 == aVar) {
                        return aVar;
                    }
                    str20 = (String) objFirst12;
                    Flow flow1111 = kVar.b.b0;
                    this.e = null;
                    this.y = str18;
                    this.z = str19;
                    this.A = str20;
                    this.C = i7;
                    this.D = i2;
                    this.E = 20;
                    objFirst13 = FlowKt.first(flow1111, this);
                    if (objFirst13 == aVar) {
                        return aVar;
                    }
                    str21 = str18;
                    str22 = str20;
                    str23 = (String) objFirst13;
                    Flow flowF6 = kVar.b.f();
                    this.e = null;
                    this.y = str21;
                    this.z = str19;
                    this.A = str22;
                    this.B = str23;
                    this.C = i7;
                    this.D = i2;
                    this.E = 21;
                    objFirst14 = FlowKt.first(flowF6, this);
                    if (objFirst14 == aVar) {
                        return aVar;
                    }
                    String str310 = str21;
                    i8 = i7;
                    str24 = str310;
                    String str311 = str22;
                    str25 = str23;
                    str26 = str311;
                    if (((Boolean) objFirst14).booleanValue()) {
                        kVar.y.setValue("Trying built-in EPG feed...");
                        com.app.mlounge.data.iptv.l lVar15 = kVar.c;
                        if (kotlin.text.k.d0(str19)) {
                            str19 = null;
                        }
                        final int i1114 = 5;
                        ?? r16 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                            @Override // kotlin.jvm.functions.l
                            public final Object invoke(Object obj2) {
                                String str312 = (String) obj2;
                                switch (i1114) {
                                    case 0:
                                        kVar.y.setValue(str312);
                                        break;
                                    case 1:
                                        kVar.y.setValue(str312);
                                        break;
                                    case 2:
                                        kVar.y.setValue(str312);
                                        break;
                                    case 3:
                                        kVar.y.setValue(str312);
                                        break;
                                    case 4:
                                        kVar.y.setValue(str312);
                                        break;
                                    default:
                                        kVar.y.setValue(str312);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i8;
                        this.D = i2;
                        this.E = 22;
                        objK = lVar15.k(str24, str19, str26, str25, r16, this);
                        if (objK == aVar) {
                            return aVar;
                        }
                        i2 = !((Map) objK).isEmpty() ? 1 : 0;
                    }
                    i6 = i8;
                    com.app.mlounge.data.local.prefs.y1 y1Var11112 = kVar.b;
                    if (i2 != 0) {
                        z = i10;
                    } else {
                        z = 0;
                    }
                    this.e = null;
                    this.y = null;
                    this.z = null;
                    this.A = null;
                    this.B = null;
                    this.C = i6;
                    this.D = i2;
                    this.E = 23;
                    objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var11112.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                    if (objS3 == aVar) {
                        objS3 = yVar;
                    }
                    if (objS3 == aVar) {
                        return aVar;
                    }
                    MutableStateFlow mutableStateFlow1110 = kVar.y;
                    if (i2 != 0) {
                        str27 = " + EPG";
                    } else {
                        str27 = "";
                    }
                    mutableStateFlow1110.setValue("Done! " + i6 + " channels" + str27);
                    return yVar;
                case 3:
                    String str41 = this.e;
                    kotlin.a.e(obj);
                    str = str41;
                    i10 = 1;
                    objI = obj;
                    iIntValue = ((Number) objI).intValue();
                    str11 = "EPG failed (channels saved): ";
                    aVar = aVar2;
                    com.app.mlounge.data.local.prefs.y1 y1Var11113 = kVar.b;
                    this.e = str;
                    this.y = null;
                    this.z = null;
                    this.A = null;
                    this.B = null;
                    this.C = iIntValue;
                    this.E = 11;
                    objS = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var11113.a), new androidx.compose.foundation.gestures.d1(iIntValue, null, 1, false), this);
                    if (objS == aVar) {
                        objS = yVar;
                    }
                    if (objS == aVar) {
                        return aVar;
                    }
                    com.app.mlounge.data.local.prefs.y1 y1Var11114 = kVar.b;
                    long jCurrentTimeMillis7 = System.currentTimeMillis();
                    this.e = str;
                    this.C = iIntValue;
                    this.E = 12;
                    str13 = str;
                    objS2 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var11114.a), new c2(jCurrentTimeMillis7, null, 1), this);
                    if (objS2 != aVar) {
                        objS2 = yVar;
                    }
                    if (objS2 == aVar) {
                        return aVar;
                    }
                    str14 = str13;
                    if (kotlin.jvm.internal.l.a(str14, "m3u")) {
                        Flow flowA7 = kVar.b.a();
                        this.e = null;
                        this.C = iIntValue;
                        this.D = 0;
                        this.E = 13;
                        objFirst10 = FlowKt.first(flowA7, this);
                        if (objFirst10 == aVar) {
                            return aVar;
                        }
                        i3 = iIntValue;
                        i4 = 0;
                        str15 = (String) objFirst10;
                        if (!kotlin.text.k.d0(str15)) {
                            kVar.y.setValue("Downloading EPG...");
                            lVar = kVar.c;
                            final int i1115 = 3;
                            lVar2 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                @Override // kotlin.jvm.functions.l
                                public final Object invoke(Object obj2) {
                                    String str312 = (String) obj2;
                                    switch (i1115) {
                                        case 0:
                                            kVar.y.setValue(str312);
                                            break;
                                        case 1:
                                            kVar.y.setValue(str312);
                                            break;
                                        case 2:
                                            kVar.y.setValue(str312);
                                            break;
                                        case 3:
                                            kVar.y.setValue(str312);
                                            break;
                                        case 4:
                                            kVar.y.setValue(str312);
                                            break;
                                        default:
                                            kVar.y.setValue(str312);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            this.e = null;
                            this.y = null;
                            this.C = i3;
                            this.D = i4;
                            this.E = 14;
                            lVar.getClass();
                            if (BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.iptv.b(lVar2, str15, lVar, null), this) == aVar) {
                                return aVar;
                            }
                            i6 = i3;
                            i2 = i10;
                            com.app.mlounge.data.local.prefs.y1 y1Var11115 = kVar.b;
                            if (i2 != 0) {
                                z = i10;
                            } else {
                                z = 0;
                            }
                            this.e = null;
                            this.y = null;
                            this.z = null;
                            this.A = null;
                            this.B = null;
                            this.C = i6;
                            this.D = i2;
                            this.E = 23;
                            objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var11115.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                            if (objS3 == aVar) {
                                objS3 = yVar;
                            }
                            if (objS3 == aVar) {
                                return aVar;
                            }
                            MutableStateFlow mutableStateFlow1111 = kVar.y;
                            if (i2 != 0) {
                                str27 = " + EPG";
                            } else {
                                str27 = "";
                            }
                            mutableStateFlow1111.setValue("Done! " + i6 + " channels" + str27);
                            return yVar;
                        }
                        i2 = i4;
                        i6 = i3;
                        com.app.mlounge.data.local.prefs.y1 y1Var11116 = kVar.b;
                        if (i2 != 0) {
                            z = i10;
                        } else {
                            z = 0;
                        }
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i6;
                        this.D = i2;
                        this.E = 23;
                        objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var11116.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                        if (objS3 == aVar) {
                            objS3 = yVar;
                        }
                        if (objS3 == aVar) {
                            return aVar;
                        }
                        MutableStateFlow mutableStateFlow1112 = kVar.y;
                        if (i2 != 0) {
                            str27 = " + EPG";
                        } else {
                            str27 = "";
                        }
                        mutableStateFlow1112.setValue("Done! " + i6 + " channels" + str27);
                        return yVar;
                    }
                    if (kotlin.jvm.internal.l.a(str14, "local")) {
                        Flow flowB7 = kVar.b.b();
                        this.e = null;
                        this.C = iIntValue;
                        this.D = 0;
                        this.E = 15;
                        objFirst9 = FlowKt.first(flowB7, this);
                        if (objFirst9 == aVar) {
                            return aVar;
                        }
                        i3 = iIntValue;
                        i4 = 0;
                        str16 = (String) objFirst9;
                        if (!kotlin.text.k.d0(str16)) {
                            kVar.y.setValue("Syncing local EPG...");
                            lVar3 = kVar.c;
                            final int i1116 = 4;
                            r3 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                @Override // kotlin.jvm.functions.l
                                public final Object invoke(Object obj2) {
                                    String str312 = (String) obj2;
                                    switch (i1116) {
                                        case 0:
                                            kVar.y.setValue(str312);
                                            break;
                                        case 1:
                                            kVar.y.setValue(str312);
                                            break;
                                        case 2:
                                            kVar.y.setValue(str312);
                                            break;
                                        case 3:
                                            kVar.y.setValue(str312);
                                            break;
                                        case 4:
                                            kVar.y.setValue(str312);
                                            break;
                                        default:
                                            kVar.y.setValue(str312);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            this.e = null;
                            this.y = null;
                            this.C = i3;
                            this.D = i4;
                            this.E = 16;
                            if (lVar3.o(str16, r3, this) == aVar) {
                                return aVar;
                            }
                            i6 = i3;
                            i2 = i10;
                            com.app.mlounge.data.local.prefs.y1 y1Var11117 = kVar.b;
                            if (i2 != 0) {
                                z = i10;
                            } else {
                                z = 0;
                            }
                            this.e = null;
                            this.y = null;
                            this.z = null;
                            this.A = null;
                            this.B = null;
                            this.C = i6;
                            this.D = i2;
                            this.E = 23;
                            objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var11117.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                            if (objS3 == aVar) {
                                objS3 = yVar;
                            }
                            if (objS3 == aVar) {
                                return aVar;
                            }
                            MutableStateFlow mutableStateFlow1113 = kVar.y;
                            if (i2 != 0) {
                                str27 = " + EPG";
                            } else {
                                str27 = "";
                            }
                            mutableStateFlow1113.setValue("Done! " + i6 + " channels" + str27);
                            return yVar;
                        }
                        i2 = i4;
                        i6 = i3;
                        com.app.mlounge.data.local.prefs.y1 y1Var11118 = kVar.b;
                        if (i2 != 0) {
                            z = i10;
                        } else {
                            z = 0;
                        }
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i6;
                        this.D = i2;
                        this.E = 23;
                        objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var11118.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                        if (objS3 == aVar) {
                            objS3 = yVar;
                        }
                        if (objS3 == aVar) {
                            return aVar;
                        }
                        MutableStateFlow mutableStateFlow1114 = kVar.y;
                        if (i2 != 0) {
                            str27 = " + EPG";
                        } else {
                            str27 = "";
                        }
                        mutableStateFlow1114.setValue("Done! " + i6 + " channels" + str27);
                        return yVar;
                    }
                    Flow flow1112 = kVar.b.Y;
                    this.e = null;
                    this.C = iIntValue;
                    this.D = 0;
                    this.E = 17;
                    objFirst8 = FlowKt.first(flow1112, this);
                    if (objFirst8 == aVar) {
                        return aVar;
                    }
                    i = iIntValue;
                    i2 = 0;
                    str17 = (String) objFirst8;
                    Flow flow1113 = kVar.b.Z;
                    this.e = null;
                    this.y = str17;
                    this.C = i;
                    this.D = i2;
                    this.E = 18;
                    objFirst11 = FlowKt.first(flow1113, this);
                    if (objFirst11 == aVar) {
                        return aVar;
                    }
                    str18 = str17;
                    i7 = i;
                    str19 = (String) objFirst11;
                    Flow flow1114 = kVar.b.a0;
                    this.e = null;
                    this.y = str18;
                    this.z = str19;
                    this.C = i7;
                    this.D = i2;
                    this.E = 19;
                    objFirst12 = FlowKt.first(flow1114, this);
                    if (objFirst12 == aVar) {
                        return aVar;
                    }
                    str20 = (String) objFirst12;
                    Flow flow1115 = kVar.b.b0;
                    this.e = null;
                    this.y = str18;
                    this.z = str19;
                    this.A = str20;
                    this.C = i7;
                    this.D = i2;
                    this.E = 20;
                    objFirst13 = FlowKt.first(flow1115, this);
                    if (objFirst13 == aVar) {
                        return aVar;
                    }
                    str21 = str18;
                    str22 = str20;
                    str23 = (String) objFirst13;
                    Flow flowF7 = kVar.b.f();
                    this.e = null;
                    this.y = str21;
                    this.z = str19;
                    this.A = str22;
                    this.B = str23;
                    this.C = i7;
                    this.D = i2;
                    this.E = 21;
                    objFirst14 = FlowKt.first(flowF7, this);
                    if (objFirst14 == aVar) {
                        return aVar;
                    }
                    String str312 = str21;
                    i8 = i7;
                    str24 = str312;
                    String str313 = str22;
                    str25 = str23;
                    str26 = str313;
                    if (((Boolean) objFirst14).booleanValue()) {
                        kVar.y.setValue("Trying built-in EPG feed...");
                        com.app.mlounge.data.iptv.l lVar16 = kVar.c;
                        if (kotlin.text.k.d0(str19)) {
                            str19 = null;
                        }
                        final int i1117 = 5;
                        ?? r17 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                            @Override // kotlin.jvm.functions.l
                            public final Object invoke(Object obj2) {
                                String str314 = (String) obj2;
                                switch (i1117) {
                                    case 0:
                                        kVar.y.setValue(str314);
                                        break;
                                    case 1:
                                        kVar.y.setValue(str314);
                                        break;
                                    case 2:
                                        kVar.y.setValue(str314);
                                        break;
                                    case 3:
                                        kVar.y.setValue(str314);
                                        break;
                                    case 4:
                                        kVar.y.setValue(str314);
                                        break;
                                    default:
                                        kVar.y.setValue(str314);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i8;
                        this.D = i2;
                        this.E = 22;
                        objK = lVar16.k(str24, str19, str26, str25, r17, this);
                        if (objK == aVar) {
                            return aVar;
                        }
                        i2 = !((Map) objK).isEmpty() ? 1 : 0;
                    }
                    i6 = i8;
                    com.app.mlounge.data.local.prefs.y1 y1Var11119 = kVar.b;
                    if (i2 != 0) {
                        z = i10;
                    } else {
                        z = 0;
                    }
                    this.e = null;
                    this.y = null;
                    this.z = null;
                    this.A = null;
                    this.B = null;
                    this.C = i6;
                    this.D = i2;
                    this.E = 23;
                    objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var11119.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                    if (objS3 == aVar) {
                        objS3 = yVar;
                    }
                    if (objS3 == aVar) {
                        return aVar;
                    }
                    MutableStateFlow mutableStateFlow1115 = kVar.y;
                    if (i2 != 0) {
                        str27 = " + EPG";
                    } else {
                        str27 = "";
                    }
                    mutableStateFlow1115.setValue("Done! " + i6 + " channels" + str27);
                    return yVar;
                case 4:
                    String str42 = this.e;
                    kotlin.a.e(obj);
                    str = str42;
                    objFirst2 = obj;
                    str3 = (String) objFirst2;
                    Flow flow120 = kVar.b.Z;
                    this.e = str;
                    this.y = str3;
                    this.E = 5;
                    objFirst5 = FlowKt.first(flow120, this);
                    if (objFirst5 != aVar2) {
                        str4 = (String) objFirst5;
                        Flow flow121 = kVar.b.a0;
                        this.e = str;
                        this.y = str3;
                        this.z = str4;
                        this.E = 6;
                        objFirst6 = FlowKt.first(flow121, this);
                        if (objFirst6 == aVar2) {
                            str5 = str;
                            str6 = str4;
                            str7 = (String) objFirst6;
                            Flow flow21 = kVar.b.b0;
                            this.e = str5;
                            this.y = str3;
                            this.z = str6;
                            this.A = str7;
                            this.E = 7;
                            objFirst7 = FlowKt.first(flow21, this);
                            if (objFirst7 == aVar2) {
                                str8 = str5;
                                str9 = str3;
                                str10 = str7;
                                String str211 = (String) objFirst7;
                                if (kotlin.text.k.d0(str9)) {
                                    break;
                                }
                                throw new Exception("Host, username, and password are required");
                            }
                        }
                    }
                    return aVar2;
                case 5:
                    str3 = this.y;
                    str = this.e;
                    kotlin.a.e(obj);
                    objFirst5 = obj;
                    i10 = 1;
                    str4 = (String) objFirst5;
                    Flow flow122 = kVar.b.a0;
                    this.e = str;
                    this.y = str3;
                    this.z = str4;
                    this.E = 6;
                    objFirst6 = FlowKt.first(flow122, this);
                    if (objFirst6 == aVar2) {
                        str5 = str;
                        str6 = str4;
                        str7 = (String) objFirst6;
                        Flow flow22 = kVar.b.b0;
                        this.e = str5;
                        this.y = str3;
                        this.z = str6;
                        this.A = str7;
                        this.E = 7;
                        objFirst7 = FlowKt.first(flow22, this);
                        if (objFirst7 == aVar2) {
                            str8 = str5;
                            str9 = str3;
                            str10 = str7;
                            String str212 = (String) objFirst7;
                            if (kotlin.text.k.d0(str9)) {
                                break;
                            }
                            throw new Exception("Host, username, and password are required");
                        }
                    }
                    return aVar2;
                case 6:
                    String str43 = this.z;
                    String str44 = this.y;
                    str5 = this.e;
                    kotlin.a.e(obj);
                    str6 = str43;
                    str3 = str44;
                    objFirst6 = obj;
                    i10 = 1;
                    str7 = (String) objFirst6;
                    Flow flow23 = kVar.b.b0;
                    this.e = str5;
                    this.y = str3;
                    this.z = str6;
                    this.A = str7;
                    this.E = 7;
                    objFirst7 = FlowKt.first(flow23, this);
                    if (objFirst7 == aVar2) {
                        return aVar2;
                    }
                    str8 = str5;
                    str9 = str3;
                    str10 = str7;
                    String str213 = (String) objFirst7;
                    if (kotlin.text.k.d0(str9)) {
                        break;
                    }
                    throw new Exception("Host, username, and password are required");
                case 7:
                    str10 = this.A;
                    str6 = this.z;
                    str9 = this.y;
                    String str45 = this.e;
                    kotlin.a.e(obj);
                    objFirst7 = obj;
                    i10 = 1;
                    str8 = str45;
                    String str214 = (String) objFirst7;
                    if (kotlin.text.k.d0(str9)) {
                        break;
                    }
                    throw new Exception("Host, username, and password are required");
                case 8:
                    String str46 = this.e;
                    kotlin.a.e(obj);
                    str11 = "EPG failed (channels saved): ";
                    aVar = aVar2;
                    i10 = 1;
                    str8 = str46;
                    objJ = obj;
                    iIntValue = ((List) objJ).size();
                    str = str8;
                    com.app.mlounge.data.local.prefs.y1 y1Var111110 = kVar.b;
                    this.e = str;
                    this.y = null;
                    this.z = null;
                    this.A = null;
                    this.B = null;
                    this.C = iIntValue;
                    this.E = 11;
                    objS = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var111110.a), new androidx.compose.foundation.gestures.d1(iIntValue, null, 1, false), this);
                    if (objS == aVar) {
                        objS = yVar;
                    }
                    if (objS == aVar) {
                        return aVar;
                    }
                    com.app.mlounge.data.local.prefs.y1 y1Var111111 = kVar.b;
                    long jCurrentTimeMillis8 = System.currentTimeMillis();
                    this.e = str;
                    this.C = iIntValue;
                    this.E = 12;
                    str13 = str;
                    objS2 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var111111.a), new c2(jCurrentTimeMillis8, null, 1), this);
                    if (objS2 != aVar) {
                        objS2 = yVar;
                    }
                    if (objS2 == aVar) {
                        return aVar;
                    }
                    str14 = str13;
                    if (kotlin.jvm.internal.l.a(str14, "m3u")) {
                        Flow flowA8 = kVar.b.a();
                        this.e = null;
                        this.C = iIntValue;
                        this.D = 0;
                        this.E = 13;
                        objFirst10 = FlowKt.first(flowA8, this);
                        if (objFirst10 == aVar) {
                            return aVar;
                        }
                        i3 = iIntValue;
                        i4 = 0;
                        str15 = (String) objFirst10;
                        if (!kotlin.text.k.d0(str15)) {
                            kVar.y.setValue("Downloading EPG...");
                            lVar = kVar.c;
                            final int i1118 = 3;
                            lVar2 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                @Override // kotlin.jvm.functions.l
                                public final Object invoke(Object obj2) {
                                    String str314 = (String) obj2;
                                    switch (i1118) {
                                        case 0:
                                            kVar.y.setValue(str314);
                                            break;
                                        case 1:
                                            kVar.y.setValue(str314);
                                            break;
                                        case 2:
                                            kVar.y.setValue(str314);
                                            break;
                                        case 3:
                                            kVar.y.setValue(str314);
                                            break;
                                        case 4:
                                            kVar.y.setValue(str314);
                                            break;
                                        default:
                                            kVar.y.setValue(str314);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            this.e = null;
                            this.y = null;
                            this.C = i3;
                            this.D = i4;
                            this.E = 14;
                            lVar.getClass();
                            if (BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.iptv.b(lVar2, str15, lVar, null), this) == aVar) {
                                return aVar;
                            }
                            i6 = i3;
                            i2 = i10;
                            com.app.mlounge.data.local.prefs.y1 y1Var111112 = kVar.b;
                            if (i2 != 0) {
                                z = i10;
                            } else {
                                z = 0;
                            }
                            this.e = null;
                            this.y = null;
                            this.z = null;
                            this.A = null;
                            this.B = null;
                            this.C = i6;
                            this.D = i2;
                            this.E = 23;
                            objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var111112.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                            if (objS3 == aVar) {
                                objS3 = yVar;
                            }
                            if (objS3 == aVar) {
                                return aVar;
                            }
                            MutableStateFlow mutableStateFlow1116 = kVar.y;
                            if (i2 != 0) {
                                str27 = " + EPG";
                            } else {
                                str27 = "";
                            }
                            mutableStateFlow1116.setValue("Done! " + i6 + " channels" + str27);
                            return yVar;
                        }
                        i2 = i4;
                        i6 = i3;
                        com.app.mlounge.data.local.prefs.y1 y1Var111113 = kVar.b;
                        if (i2 != 0) {
                            z = i10;
                        } else {
                            z = 0;
                        }
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i6;
                        this.D = i2;
                        this.E = 23;
                        objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var111113.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                        if (objS3 == aVar) {
                            objS3 = yVar;
                        }
                        if (objS3 == aVar) {
                            return aVar;
                        }
                        MutableStateFlow mutableStateFlow1117 = kVar.y;
                        if (i2 != 0) {
                            str27 = " + EPG";
                        } else {
                            str27 = "";
                        }
                        mutableStateFlow1117.setValue("Done! " + i6 + " channels" + str27);
                        return yVar;
                    }
                    if (kotlin.jvm.internal.l.a(str14, "local")) {
                        Flow flowB8 = kVar.b.b();
                        this.e = null;
                        this.C = iIntValue;
                        this.D = 0;
                        this.E = 15;
                        objFirst9 = FlowKt.first(flowB8, this);
                        if (objFirst9 == aVar) {
                            return aVar;
                        }
                        i3 = iIntValue;
                        i4 = 0;
                        str16 = (String) objFirst9;
                        if (!kotlin.text.k.d0(str16)) {
                            kVar.y.setValue("Syncing local EPG...");
                            lVar3 = kVar.c;
                            final int i1119 = 4;
                            r3 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                @Override // kotlin.jvm.functions.l
                                public final Object invoke(Object obj2) {
                                    String str314 = (String) obj2;
                                    switch (i1119) {
                                        case 0:
                                            kVar.y.setValue(str314);
                                            break;
                                        case 1:
                                            kVar.y.setValue(str314);
                                            break;
                                        case 2:
                                            kVar.y.setValue(str314);
                                            break;
                                        case 3:
                                            kVar.y.setValue(str314);
                                            break;
                                        case 4:
                                            kVar.y.setValue(str314);
                                            break;
                                        default:
                                            kVar.y.setValue(str314);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            this.e = null;
                            this.y = null;
                            this.C = i3;
                            this.D = i4;
                            this.E = 16;
                            if (lVar3.o(str16, r3, this) == aVar) {
                                return aVar;
                            }
                            i6 = i3;
                            i2 = i10;
                            com.app.mlounge.data.local.prefs.y1 y1Var111114 = kVar.b;
                            if (i2 != 0) {
                                z = i10;
                            } else {
                                z = 0;
                            }
                            this.e = null;
                            this.y = null;
                            this.z = null;
                            this.A = null;
                            this.B = null;
                            this.C = i6;
                            this.D = i2;
                            this.E = 23;
                            objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var111114.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                            if (objS3 == aVar) {
                                objS3 = yVar;
                            }
                            if (objS3 == aVar) {
                                return aVar;
                            }
                            MutableStateFlow mutableStateFlow1118 = kVar.y;
                            if (i2 != 0) {
                                str27 = " + EPG";
                            } else {
                                str27 = "";
                            }
                            mutableStateFlow1118.setValue("Done! " + i6 + " channels" + str27);
                            return yVar;
                        }
                        i2 = i4;
                        i6 = i3;
                        com.app.mlounge.data.local.prefs.y1 y1Var111115 = kVar.b;
                        if (i2 != 0) {
                            z = i10;
                        } else {
                            z = 0;
                        }
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i6;
                        this.D = i2;
                        this.E = 23;
                        objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var111115.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                        if (objS3 == aVar) {
                            objS3 = yVar;
                        }
                        if (objS3 == aVar) {
                            return aVar;
                        }
                        MutableStateFlow mutableStateFlow1119 = kVar.y;
                        if (i2 != 0) {
                            str27 = " + EPG";
                        } else {
                            str27 = "";
                        }
                        mutableStateFlow1119.setValue("Done! " + i6 + " channels" + str27);
                        return yVar;
                    }
                    Flow flow1116 = kVar.b.Y;
                    this.e = null;
                    this.C = iIntValue;
                    this.D = 0;
                    this.E = 17;
                    objFirst8 = FlowKt.first(flow1116, this);
                    if (objFirst8 == aVar) {
                        return aVar;
                    }
                    i = iIntValue;
                    i2 = 0;
                    str17 = (String) objFirst8;
                    Flow flow1117 = kVar.b.Z;
                    this.e = null;
                    this.y = str17;
                    this.C = i;
                    this.D = i2;
                    this.E = 18;
                    objFirst11 = FlowKt.first(flow1117, this);
                    if (objFirst11 == aVar) {
                        return aVar;
                    }
                    str18 = str17;
                    i7 = i;
                    str19 = (String) objFirst11;
                    Flow flow1118 = kVar.b.a0;
                    this.e = null;
                    this.y = str18;
                    this.z = str19;
                    this.C = i7;
                    this.D = i2;
                    this.E = 19;
                    objFirst12 = FlowKt.first(flow1118, this);
                    if (objFirst12 == aVar) {
                        return aVar;
                    }
                    str20 = (String) objFirst12;
                    Flow flow1119 = kVar.b.b0;
                    this.e = null;
                    this.y = str18;
                    this.z = str19;
                    this.A = str20;
                    this.C = i7;
                    this.D = i2;
                    this.E = 20;
                    objFirst13 = FlowKt.first(flow1119, this);
                    if (objFirst13 == aVar) {
                        return aVar;
                    }
                    str21 = str18;
                    str22 = str20;
                    str23 = (String) objFirst13;
                    Flow flowF8 = kVar.b.f();
                    this.e = null;
                    this.y = str21;
                    this.z = str19;
                    this.A = str22;
                    this.B = str23;
                    this.C = i7;
                    this.D = i2;
                    this.E = 21;
                    objFirst14 = FlowKt.first(flowF8, this);
                    if (objFirst14 == aVar) {
                        return aVar;
                    }
                    String str314 = str21;
                    i8 = i7;
                    str24 = str314;
                    String str315 = str22;
                    str25 = str23;
                    str26 = str315;
                    if (((Boolean) objFirst14).booleanValue()) {
                        kVar.y.setValue("Trying built-in EPG feed...");
                        com.app.mlounge.data.iptv.l lVar17 = kVar.c;
                        if (kotlin.text.k.d0(str19)) {
                            str19 = null;
                        }
                        final int i11110 = 5;
                        ?? r18 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                            @Override // kotlin.jvm.functions.l
                            public final Object invoke(Object obj2) {
                                String str316 = (String) obj2;
                                switch (i11110) {
                                    case 0:
                                        kVar.y.setValue(str316);
                                        break;
                                    case 1:
                                        kVar.y.setValue(str316);
                                        break;
                                    case 2:
                                        kVar.y.setValue(str316);
                                        break;
                                    case 3:
                                        kVar.y.setValue(str316);
                                        break;
                                    case 4:
                                        kVar.y.setValue(str316);
                                        break;
                                    default:
                                        kVar.y.setValue(str316);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i8;
                        this.D = i2;
                        this.E = 22;
                        objK = lVar17.k(str24, str19, str26, str25, r18, this);
                        if (objK == aVar) {
                            return aVar;
                        }
                        i2 = !((Map) objK).isEmpty() ? 1 : 0;
                    }
                    i6 = i8;
                    com.app.mlounge.data.local.prefs.y1 y1Var111116 = kVar.b;
                    if (i2 != 0) {
                        z = i10;
                    } else {
                        z = 0;
                    }
                    this.e = null;
                    this.y = null;
                    this.z = null;
                    this.A = null;
                    this.B = null;
                    this.C = i6;
                    this.D = i2;
                    this.E = 23;
                    objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var111116.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                    if (objS3 == aVar) {
                        objS3 = yVar;
                    }
                    if (objS3 == aVar) {
                        return aVar;
                    }
                    MutableStateFlow mutableStateFlow11110 = kVar.y;
                    if (i2 != 0) {
                        str27 = " + EPG";
                    } else {
                        str27 = "";
                    }
                    mutableStateFlow11110.setValue("Done! " + i6 + " channels" + str27);
                    return yVar;
                case 9:
                    String str47 = this.e;
                    kotlin.a.e(obj);
                    str = str47;
                    objFirst4 = obj;
                    str12 = (String) objFirst4;
                    if (kotlin.text.k.d0(str12)) {
                        throw new Exception("Local M3U file is required");
                    }
                    com.app.mlounge.data.iptv.l lVar18 = kVar.c;
                    final int i1120 = 2;
                    ?? r19 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                        @Override // kotlin.jvm.functions.l
                        public final Object invoke(Object obj2) {
                            String str316 = (String) obj2;
                            switch (i1120) {
                                case 0:
                                    kVar.y.setValue(str316);
                                    break;
                                case 1:
                                    kVar.y.setValue(str316);
                                    break;
                                case 2:
                                    kVar.y.setValue(str316);
                                    break;
                                case 3:
                                    kVar.y.setValue(str316);
                                    break;
                                case 4:
                                    kVar.y.setValue(str316);
                                    break;
                                default:
                                    kVar.y.setValue(str316);
                                    break;
                            }
                            return kotlin.y.a;
                        }
                    };
                    this.e = str;
                    this.y = null;
                    this.E = 10;
                    objP = lVar18.p(str12, r19, this);
                    if (objP == aVar2) {
                        return aVar2;
                    }
                    iIntValue = ((Number) objP).intValue();
                    str11 = "EPG failed (channels saved): ";
                    aVar = aVar2;
                    com.app.mlounge.data.local.prefs.y1 y1Var111117 = kVar.b;
                    this.e = str;
                    this.y = null;
                    this.z = null;
                    this.A = null;
                    this.B = null;
                    this.C = iIntValue;
                    this.E = 11;
                    objS = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var111117.a), new androidx.compose.foundation.gestures.d1(iIntValue, null, 1, false), this);
                    if (objS == aVar) {
                        objS = yVar;
                    }
                    if (objS == aVar) {
                        return aVar;
                    }
                    com.app.mlounge.data.local.prefs.y1 y1Var111118 = kVar.b;
                    long jCurrentTimeMillis9 = System.currentTimeMillis();
                    this.e = str;
                    this.C = iIntValue;
                    this.E = 12;
                    str13 = str;
                    objS2 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var111118.a), new c2(jCurrentTimeMillis9, null, 1), this);
                    if (objS2 != aVar) {
                        objS2 = yVar;
                    }
                    if (objS2 == aVar) {
                        return aVar;
                    }
                    str14 = str13;
                    if (kotlin.jvm.internal.l.a(str14, "m3u")) {
                        Flow flowA9 = kVar.b.a();
                        this.e = null;
                        this.C = iIntValue;
                        this.D = 0;
                        this.E = 13;
                        objFirst10 = FlowKt.first(flowA9, this);
                        if (objFirst10 == aVar) {
                            return aVar;
                        }
                        i3 = iIntValue;
                        i4 = 0;
                        str15 = (String) objFirst10;
                        if (!kotlin.text.k.d0(str15)) {
                            kVar.y.setValue("Downloading EPG...");
                            lVar = kVar.c;
                            final int i11111 = 3;
                            lVar2 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                @Override // kotlin.jvm.functions.l
                                public final Object invoke(Object obj2) {
                                    String str316 = (String) obj2;
                                    switch (i11111) {
                                        case 0:
                                            kVar.y.setValue(str316);
                                            break;
                                        case 1:
                                            kVar.y.setValue(str316);
                                            break;
                                        case 2:
                                            kVar.y.setValue(str316);
                                            break;
                                        case 3:
                                            kVar.y.setValue(str316);
                                            break;
                                        case 4:
                                            kVar.y.setValue(str316);
                                            break;
                                        default:
                                            kVar.y.setValue(str316);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            this.e = null;
                            this.y = null;
                            this.C = i3;
                            this.D = i4;
                            this.E = 14;
                            lVar.getClass();
                            if (BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.iptv.b(lVar2, str15, lVar, null), this) == aVar) {
                                return aVar;
                            }
                            i6 = i3;
                            i2 = i10;
                            com.app.mlounge.data.local.prefs.y1 y1Var111119 = kVar.b;
                            if (i2 != 0) {
                                z = i10;
                            } else {
                                z = 0;
                            }
                            this.e = null;
                            this.y = null;
                            this.z = null;
                            this.A = null;
                            this.B = null;
                            this.C = i6;
                            this.D = i2;
                            this.E = 23;
                            objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var111119.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                            if (objS3 == aVar) {
                                objS3 = yVar;
                            }
                            if (objS3 == aVar) {
                                return aVar;
                            }
                            MutableStateFlow mutableStateFlow11111 = kVar.y;
                            if (i2 != 0) {
                                str27 = " + EPG";
                            } else {
                                str27 = "";
                            }
                            mutableStateFlow11111.setValue("Done! " + i6 + " channels" + str27);
                            return yVar;
                        }
                        i2 = i4;
                        i6 = i3;
                        com.app.mlounge.data.local.prefs.y1 y1Var1111110 = kVar.b;
                        if (i2 != 0) {
                            z = i10;
                        } else {
                            z = 0;
                        }
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i6;
                        this.D = i2;
                        this.E = 23;
                        objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var1111110.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                        if (objS3 == aVar) {
                            objS3 = yVar;
                        }
                        if (objS3 == aVar) {
                            return aVar;
                        }
                        MutableStateFlow mutableStateFlow11112 = kVar.y;
                        if (i2 != 0) {
                            str27 = " + EPG";
                        } else {
                            str27 = "";
                        }
                        mutableStateFlow11112.setValue("Done! " + i6 + " channels" + str27);
                        return yVar;
                    }
                    if (kotlin.jvm.internal.l.a(str14, "local")) {
                        Flow flowB9 = kVar.b.b();
                        this.e = null;
                        this.C = iIntValue;
                        this.D = 0;
                        this.E = 15;
                        objFirst9 = FlowKt.first(flowB9, this);
                        if (objFirst9 == aVar) {
                            return aVar;
                        }
                        i3 = iIntValue;
                        i4 = 0;
                        str16 = (String) objFirst9;
                        if (!kotlin.text.k.d0(str16)) {
                            kVar.y.setValue("Syncing local EPG...");
                            lVar3 = kVar.c;
                            final int i11112 = 4;
                            r3 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                @Override // kotlin.jvm.functions.l
                                public final Object invoke(Object obj2) {
                                    String str316 = (String) obj2;
                                    switch (i11112) {
                                        case 0:
                                            kVar.y.setValue(str316);
                                            break;
                                        case 1:
                                            kVar.y.setValue(str316);
                                            break;
                                        case 2:
                                            kVar.y.setValue(str316);
                                            break;
                                        case 3:
                                            kVar.y.setValue(str316);
                                            break;
                                        case 4:
                                            kVar.y.setValue(str316);
                                            break;
                                        default:
                                            kVar.y.setValue(str316);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            this.e = null;
                            this.y = null;
                            this.C = i3;
                            this.D = i4;
                            this.E = 16;
                            if (lVar3.o(str16, r3, this) == aVar) {
                                return aVar;
                            }
                            i6 = i3;
                            i2 = i10;
                            com.app.mlounge.data.local.prefs.y1 y1Var1111111 = kVar.b;
                            if (i2 != 0) {
                                z = i10;
                            } else {
                                z = 0;
                            }
                            this.e = null;
                            this.y = null;
                            this.z = null;
                            this.A = null;
                            this.B = null;
                            this.C = i6;
                            this.D = i2;
                            this.E = 23;
                            objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var1111111.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                            if (objS3 == aVar) {
                                objS3 = yVar;
                            }
                            if (objS3 == aVar) {
                                return aVar;
                            }
                            MutableStateFlow mutableStateFlow11113 = kVar.y;
                            if (i2 != 0) {
                                str27 = " + EPG";
                            } else {
                                str27 = "";
                            }
                            mutableStateFlow11113.setValue("Done! " + i6 + " channels" + str27);
                            return yVar;
                        }
                        i2 = i4;
                        i6 = i3;
                        com.app.mlounge.data.local.prefs.y1 y1Var1111112 = kVar.b;
                        if (i2 != 0) {
                            z = i10;
                        } else {
                            z = 0;
                        }
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i6;
                        this.D = i2;
                        this.E = 23;
                        objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var1111112.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                        if (objS3 == aVar) {
                            objS3 = yVar;
                        }
                        if (objS3 == aVar) {
                            return aVar;
                        }
                        MutableStateFlow mutableStateFlow11114 = kVar.y;
                        if (i2 != 0) {
                            str27 = " + EPG";
                        } else {
                            str27 = "";
                        }
                        mutableStateFlow11114.setValue("Done! " + i6 + " channels" + str27);
                        return yVar;
                    }
                    Flow flow11110 = kVar.b.Y;
                    this.e = null;
                    this.C = iIntValue;
                    this.D = 0;
                    this.E = 17;
                    objFirst8 = FlowKt.first(flow11110, this);
                    if (objFirst8 == aVar) {
                        return aVar;
                    }
                    i = iIntValue;
                    i2 = 0;
                    str17 = (String) objFirst8;
                    Flow flow11111 = kVar.b.Z;
                    this.e = null;
                    this.y = str17;
                    this.C = i;
                    this.D = i2;
                    this.E = 18;
                    objFirst11 = FlowKt.first(flow11111, this);
                    if (objFirst11 == aVar) {
                        return aVar;
                    }
                    str18 = str17;
                    i7 = i;
                    str19 = (String) objFirst11;
                    Flow flow11112 = kVar.b.a0;
                    this.e = null;
                    this.y = str18;
                    this.z = str19;
                    this.C = i7;
                    this.D = i2;
                    this.E = 19;
                    objFirst12 = FlowKt.first(flow11112, this);
                    if (objFirst12 == aVar) {
                        return aVar;
                    }
                    str20 = (String) objFirst12;
                    Flow flow11113 = kVar.b.b0;
                    this.e = null;
                    this.y = str18;
                    this.z = str19;
                    this.A = str20;
                    this.C = i7;
                    this.D = i2;
                    this.E = 20;
                    objFirst13 = FlowKt.first(flow11113, this);
                    if (objFirst13 == aVar) {
                        return aVar;
                    }
                    str21 = str18;
                    str22 = str20;
                    str23 = (String) objFirst13;
                    Flow flowF9 = kVar.b.f();
                    this.e = null;
                    this.y = str21;
                    this.z = str19;
                    this.A = str22;
                    this.B = str23;
                    this.C = i7;
                    this.D = i2;
                    this.E = 21;
                    objFirst14 = FlowKt.first(flowF9, this);
                    if (objFirst14 == aVar) {
                        return aVar;
                    }
                    String str316 = str21;
                    i8 = i7;
                    str24 = str316;
                    String str317 = str22;
                    str25 = str23;
                    str26 = str317;
                    if (((Boolean) objFirst14).booleanValue()) {
                        kVar.y.setValue("Trying built-in EPG feed...");
                        com.app.mlounge.data.iptv.l lVar19 = kVar.c;
                        if (kotlin.text.k.d0(str19)) {
                            str19 = null;
                        }
                        final int i11113 = 5;
                        ?? r110 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                            @Override // kotlin.jvm.functions.l
                            public final Object invoke(Object obj2) {
                                String str318 = (String) obj2;
                                switch (i11113) {
                                    case 0:
                                        kVar.y.setValue(str318);
                                        break;
                                    case 1:
                                        kVar.y.setValue(str318);
                                        break;
                                    case 2:
                                        kVar.y.setValue(str318);
                                        break;
                                    case 3:
                                        kVar.y.setValue(str318);
                                        break;
                                    case 4:
                                        kVar.y.setValue(str318);
                                        break;
                                    default:
                                        kVar.y.setValue(str318);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i8;
                        this.D = i2;
                        this.E = 22;
                        objK = lVar19.k(str24, str19, str26, str25, r110, this);
                        if (objK == aVar) {
                            return aVar;
                        }
                        i2 = !((Map) objK).isEmpty() ? 1 : 0;
                    }
                    i6 = i8;
                    com.app.mlounge.data.local.prefs.y1 y1Var1111113 = kVar.b;
                    if (i2 != 0) {
                        z = i10;
                    } else {
                        z = 0;
                    }
                    this.e = null;
                    this.y = null;
                    this.z = null;
                    this.A = null;
                    this.B = null;
                    this.C = i6;
                    this.D = i2;
                    this.E = 23;
                    objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var1111113.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                    if (objS3 == aVar) {
                        objS3 = yVar;
                    }
                    if (objS3 == aVar) {
                        return aVar;
                    }
                    MutableStateFlow mutableStateFlow11115 = kVar.y;
                    if (i2 != 0) {
                        str27 = " + EPG";
                    } else {
                        str27 = "";
                    }
                    mutableStateFlow11115.setValue("Done! " + i6 + " channels" + str27);
                    return yVar;
                case 10:
                    String str48 = this.e;
                    kotlin.a.e(obj);
                    str = str48;
                    objP = obj;
                    iIntValue = ((Number) objP).intValue();
                    str11 = "EPG failed (channels saved): ";
                    aVar = aVar2;
                    com.app.mlounge.data.local.prefs.y1 y1Var1111114 = kVar.b;
                    this.e = str;
                    this.y = null;
                    this.z = null;
                    this.A = null;
                    this.B = null;
                    this.C = iIntValue;
                    this.E = 11;
                    objS = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var1111114.a), new androidx.compose.foundation.gestures.d1(iIntValue, null, 1, false), this);
                    if (objS == aVar) {
                        objS = yVar;
                    }
                    if (objS == aVar) {
                        return aVar;
                    }
                    com.app.mlounge.data.local.prefs.y1 y1Var1111115 = kVar.b;
                    long jCurrentTimeMillis10 = System.currentTimeMillis();
                    this.e = str;
                    this.C = iIntValue;
                    this.E = 12;
                    str13 = str;
                    objS2 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var1111115.a), new c2(jCurrentTimeMillis10, null, 1), this);
                    if (objS2 != aVar) {
                        objS2 = yVar;
                    }
                    if (objS2 == aVar) {
                        return aVar;
                    }
                    str14 = str13;
                    if (kotlin.jvm.internal.l.a(str14, "m3u")) {
                        Flow flowA10 = kVar.b.a();
                        this.e = null;
                        this.C = iIntValue;
                        this.D = 0;
                        this.E = 13;
                        objFirst10 = FlowKt.first(flowA10, this);
                        if (objFirst10 == aVar) {
                            return aVar;
                        }
                        i3 = iIntValue;
                        i4 = 0;
                        str15 = (String) objFirst10;
                        if (!kotlin.text.k.d0(str15)) {
                            kVar.y.setValue("Downloading EPG...");
                            lVar = kVar.c;
                            final int i11114 = 3;
                            lVar2 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                @Override // kotlin.jvm.functions.l
                                public final Object invoke(Object obj2) {
                                    String str318 = (String) obj2;
                                    switch (i11114) {
                                        case 0:
                                            kVar.y.setValue(str318);
                                            break;
                                        case 1:
                                            kVar.y.setValue(str318);
                                            break;
                                        case 2:
                                            kVar.y.setValue(str318);
                                            break;
                                        case 3:
                                            kVar.y.setValue(str318);
                                            break;
                                        case 4:
                                            kVar.y.setValue(str318);
                                            break;
                                        default:
                                            kVar.y.setValue(str318);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            this.e = null;
                            this.y = null;
                            this.C = i3;
                            this.D = i4;
                            this.E = 14;
                            lVar.getClass();
                            if (BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.iptv.b(lVar2, str15, lVar, null), this) == aVar) {
                                return aVar;
                            }
                            i6 = i3;
                            i2 = i10;
                            com.app.mlounge.data.local.prefs.y1 y1Var1111116 = kVar.b;
                            if (i2 != 0) {
                                z = i10;
                            } else {
                                z = 0;
                            }
                            this.e = null;
                            this.y = null;
                            this.z = null;
                            this.A = null;
                            this.B = null;
                            this.C = i6;
                            this.D = i2;
                            this.E = 23;
                            objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var1111116.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                            if (objS3 == aVar) {
                                objS3 = yVar;
                            }
                            if (objS3 == aVar) {
                                return aVar;
                            }
                            MutableStateFlow mutableStateFlow11116 = kVar.y;
                            if (i2 != 0) {
                                str27 = " + EPG";
                            } else {
                                str27 = "";
                            }
                            mutableStateFlow11116.setValue("Done! " + i6 + " channels" + str27);
                            return yVar;
                        }
                        i2 = i4;
                        i6 = i3;
                        com.app.mlounge.data.local.prefs.y1 y1Var1111117 = kVar.b;
                        if (i2 != 0) {
                            z = i10;
                        } else {
                            z = 0;
                        }
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i6;
                        this.D = i2;
                        this.E = 23;
                        objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var1111117.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                        if (objS3 == aVar) {
                            objS3 = yVar;
                        }
                        if (objS3 == aVar) {
                            return aVar;
                        }
                        MutableStateFlow mutableStateFlow11117 = kVar.y;
                        if (i2 != 0) {
                            str27 = " + EPG";
                        } else {
                            str27 = "";
                        }
                        mutableStateFlow11117.setValue("Done! " + i6 + " channels" + str27);
                        return yVar;
                    }
                    if (kotlin.jvm.internal.l.a(str14, "local")) {
                        Flow flowB10 = kVar.b.b();
                        this.e = null;
                        this.C = iIntValue;
                        this.D = 0;
                        this.E = 15;
                        objFirst9 = FlowKt.first(flowB10, this);
                        if (objFirst9 == aVar) {
                            return aVar;
                        }
                        i3 = iIntValue;
                        i4 = 0;
                        str16 = (String) objFirst9;
                        if (!kotlin.text.k.d0(str16)) {
                            kVar.y.setValue("Syncing local EPG...");
                            lVar3 = kVar.c;
                            final int i11115 = 4;
                            r3 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                @Override // kotlin.jvm.functions.l
                                public final Object invoke(Object obj2) {
                                    String str318 = (String) obj2;
                                    switch (i11115) {
                                        case 0:
                                            kVar.y.setValue(str318);
                                            break;
                                        case 1:
                                            kVar.y.setValue(str318);
                                            break;
                                        case 2:
                                            kVar.y.setValue(str318);
                                            break;
                                        case 3:
                                            kVar.y.setValue(str318);
                                            break;
                                        case 4:
                                            kVar.y.setValue(str318);
                                            break;
                                        default:
                                            kVar.y.setValue(str318);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            this.e = null;
                            this.y = null;
                            this.C = i3;
                            this.D = i4;
                            this.E = 16;
                            if (lVar3.o(str16, r3, this) == aVar) {
                                return aVar;
                            }
                            i6 = i3;
                            i2 = i10;
                            com.app.mlounge.data.local.prefs.y1 y1Var1111118 = kVar.b;
                            if (i2 != 0) {
                                z = i10;
                            } else {
                                z = 0;
                            }
                            this.e = null;
                            this.y = null;
                            this.z = null;
                            this.A = null;
                            this.B = null;
                            this.C = i6;
                            this.D = i2;
                            this.E = 23;
                            objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var1111118.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                            if (objS3 == aVar) {
                                objS3 = yVar;
                            }
                            if (objS3 == aVar) {
                                return aVar;
                            }
                            MutableStateFlow mutableStateFlow11118 = kVar.y;
                            if (i2 != 0) {
                                str27 = " + EPG";
                            } else {
                                str27 = "";
                            }
                            mutableStateFlow11118.setValue("Done! " + i6 + " channels" + str27);
                            return yVar;
                        }
                        i2 = i4;
                        i6 = i3;
                        com.app.mlounge.data.local.prefs.y1 y1Var1111119 = kVar.b;
                        if (i2 != 0) {
                            z = i10;
                        } else {
                            z = 0;
                        }
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i6;
                        this.D = i2;
                        this.E = 23;
                        objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var1111119.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                        if (objS3 == aVar) {
                            objS3 = yVar;
                        }
                        if (objS3 == aVar) {
                            return aVar;
                        }
                        MutableStateFlow mutableStateFlow11119 = kVar.y;
                        if (i2 != 0) {
                            str27 = " + EPG";
                        } else {
                            str27 = "";
                        }
                        mutableStateFlow11119.setValue("Done! " + i6 + " channels" + str27);
                        return yVar;
                    }
                    Flow flow11114 = kVar.b.Y;
                    this.e = null;
                    this.C = iIntValue;
                    this.D = 0;
                    this.E = 17;
                    objFirst8 = FlowKt.first(flow11114, this);
                    if (objFirst8 == aVar) {
                        return aVar;
                    }
                    i = iIntValue;
                    i2 = 0;
                    str17 = (String) objFirst8;
                    Flow flow11115 = kVar.b.Z;
                    this.e = null;
                    this.y = str17;
                    this.C = i;
                    this.D = i2;
                    this.E = 18;
                    objFirst11 = FlowKt.first(flow11115, this);
                    if (objFirst11 == aVar) {
                        return aVar;
                    }
                    str18 = str17;
                    i7 = i;
                    str19 = (String) objFirst11;
                    Flow flow11116 = kVar.b.a0;
                    this.e = null;
                    this.y = str18;
                    this.z = str19;
                    this.C = i7;
                    this.D = i2;
                    this.E = 19;
                    objFirst12 = FlowKt.first(flow11116, this);
                    if (objFirst12 == aVar) {
                        return aVar;
                    }
                    str20 = (String) objFirst12;
                    Flow flow11117 = kVar.b.b0;
                    this.e = null;
                    this.y = str18;
                    this.z = str19;
                    this.A = str20;
                    this.C = i7;
                    this.D = i2;
                    this.E = 20;
                    objFirst13 = FlowKt.first(flow11117, this);
                    if (objFirst13 == aVar) {
                        return aVar;
                    }
                    str21 = str18;
                    str22 = str20;
                    str23 = (String) objFirst13;
                    Flow flowF10 = kVar.b.f();
                    this.e = null;
                    this.y = str21;
                    this.z = str19;
                    this.A = str22;
                    this.B = str23;
                    this.C = i7;
                    this.D = i2;
                    this.E = 21;
                    objFirst14 = FlowKt.first(flowF10, this);
                    if (objFirst14 == aVar) {
                        return aVar;
                    }
                    String str318 = str21;
                    i8 = i7;
                    str24 = str318;
                    String str319 = str22;
                    str25 = str23;
                    str26 = str319;
                    if (((Boolean) objFirst14).booleanValue()) {
                        kVar.y.setValue("Trying built-in EPG feed...");
                        com.app.mlounge.data.iptv.l lVar110 = kVar.c;
                        if (kotlin.text.k.d0(str19)) {
                            str19 = null;
                        }
                        final int i11116 = 5;
                        ?? r111 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                            @Override // kotlin.jvm.functions.l
                            public final Object invoke(Object obj2) {
                                String str3110 = (String) obj2;
                                switch (i11116) {
                                    case 0:
                                        kVar.y.setValue(str3110);
                                        break;
                                    case 1:
                                        kVar.y.setValue(str3110);
                                        break;
                                    case 2:
                                        kVar.y.setValue(str3110);
                                        break;
                                    case 3:
                                        kVar.y.setValue(str3110);
                                        break;
                                    case 4:
                                        kVar.y.setValue(str3110);
                                        break;
                                    default:
                                        kVar.y.setValue(str3110);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i8;
                        this.D = i2;
                        this.E = 22;
                        objK = lVar110.k(str24, str19, str26, str25, r111, this);
                        if (objK == aVar) {
                            return aVar;
                        }
                        i2 = !((Map) objK).isEmpty() ? 1 : 0;
                    }
                    i6 = i8;
                    com.app.mlounge.data.local.prefs.y1 y1Var11111110 = kVar.b;
                    if (i2 != 0) {
                        z = i10;
                    } else {
                        z = 0;
                    }
                    this.e = null;
                    this.y = null;
                    this.z = null;
                    this.A = null;
                    this.B = null;
                    this.C = i6;
                    this.D = i2;
                    this.E = 23;
                    objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var11111110.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                    if (objS3 == aVar) {
                        objS3 = yVar;
                    }
                    if (objS3 == aVar) {
                        return aVar;
                    }
                    MutableStateFlow mutableStateFlow111110 = kVar.y;
                    if (i2 != 0) {
                        str27 = " + EPG";
                    } else {
                        str27 = "";
                    }
                    mutableStateFlow111110.setValue("Done! " + i6 + " channels" + str27);
                    return yVar;
                case 11:
                    iIntValue = this.C;
                    str = this.e;
                    kotlin.a.e(obj);
                    str11 = "EPG failed (channels saved): ";
                    aVar = aVar2;
                    i10 = 1;
                    com.app.mlounge.data.local.prefs.y1 y1Var11111111 = kVar.b;
                    long jCurrentTimeMillis11 = System.currentTimeMillis();
                    this.e = str;
                    this.C = iIntValue;
                    this.E = 12;
                    str13 = str;
                    objS2 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var11111111.a), new c2(jCurrentTimeMillis11, null, 1), this);
                    if (objS2 != aVar) {
                        objS2 = yVar;
                    }
                    if (objS2 == aVar) {
                        return aVar;
                    }
                    str14 = str13;
                    if (kotlin.jvm.internal.l.a(str14, "m3u")) {
                        Flow flowA11 = kVar.b.a();
                        this.e = null;
                        this.C = iIntValue;
                        this.D = 0;
                        this.E = 13;
                        objFirst10 = FlowKt.first(flowA11, this);
                        if (objFirst10 == aVar) {
                            return aVar;
                        }
                        i3 = iIntValue;
                        i4 = 0;
                        str15 = (String) objFirst10;
                        if (!kotlin.text.k.d0(str15)) {
                            kVar.y.setValue("Downloading EPG...");
                            lVar = kVar.c;
                            final int i11117 = 3;
                            lVar2 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                @Override // kotlin.jvm.functions.l
                                public final Object invoke(Object obj2) {
                                    String str3110 = (String) obj2;
                                    switch (i11117) {
                                        case 0:
                                            kVar.y.setValue(str3110);
                                            break;
                                        case 1:
                                            kVar.y.setValue(str3110);
                                            break;
                                        case 2:
                                            kVar.y.setValue(str3110);
                                            break;
                                        case 3:
                                            kVar.y.setValue(str3110);
                                            break;
                                        case 4:
                                            kVar.y.setValue(str3110);
                                            break;
                                        default:
                                            kVar.y.setValue(str3110);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            this.e = null;
                            this.y = null;
                            this.C = i3;
                            this.D = i4;
                            this.E = 14;
                            lVar.getClass();
                            if (BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.iptv.b(lVar2, str15, lVar, null), this) == aVar) {
                                return aVar;
                            }
                            i6 = i3;
                            i2 = i10;
                            com.app.mlounge.data.local.prefs.y1 y1Var11111112 = kVar.b;
                            if (i2 != 0) {
                                z = i10;
                            } else {
                                z = 0;
                            }
                            this.e = null;
                            this.y = null;
                            this.z = null;
                            this.A = null;
                            this.B = null;
                            this.C = i6;
                            this.D = i2;
                            this.E = 23;
                            objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var11111112.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                            if (objS3 == aVar) {
                                objS3 = yVar;
                            }
                            if (objS3 == aVar) {
                                return aVar;
                            }
                            MutableStateFlow mutableStateFlow111111 = kVar.y;
                            if (i2 != 0) {
                                str27 = " + EPG";
                            } else {
                                str27 = "";
                            }
                            mutableStateFlow111111.setValue("Done! " + i6 + " channels" + str27);
                            return yVar;
                        }
                        i2 = i4;
                        i6 = i3;
                        com.app.mlounge.data.local.prefs.y1 y1Var11111113 = kVar.b;
                        if (i2 != 0) {
                            z = i10;
                        } else {
                            z = 0;
                        }
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i6;
                        this.D = i2;
                        this.E = 23;
                        objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var11111113.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                        if (objS3 == aVar) {
                            objS3 = yVar;
                        }
                        if (objS3 == aVar) {
                            return aVar;
                        }
                        MutableStateFlow mutableStateFlow111112 = kVar.y;
                        if (i2 != 0) {
                            str27 = " + EPG";
                        } else {
                            str27 = "";
                        }
                        mutableStateFlow111112.setValue("Done! " + i6 + " channels" + str27);
                        return yVar;
                    }
                    if (kotlin.jvm.internal.l.a(str14, "local")) {
                        Flow flowB11 = kVar.b.b();
                        this.e = null;
                        this.C = iIntValue;
                        this.D = 0;
                        this.E = 15;
                        objFirst9 = FlowKt.first(flowB11, this);
                        if (objFirst9 == aVar) {
                            return aVar;
                        }
                        i3 = iIntValue;
                        i4 = 0;
                        str16 = (String) objFirst9;
                        if (!kotlin.text.k.d0(str16)) {
                            kVar.y.setValue("Syncing local EPG...");
                            lVar3 = kVar.c;
                            final int i11118 = 4;
                            r3 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                @Override // kotlin.jvm.functions.l
                                public final Object invoke(Object obj2) {
                                    String str3110 = (String) obj2;
                                    switch (i11118) {
                                        case 0:
                                            kVar.y.setValue(str3110);
                                            break;
                                        case 1:
                                            kVar.y.setValue(str3110);
                                            break;
                                        case 2:
                                            kVar.y.setValue(str3110);
                                            break;
                                        case 3:
                                            kVar.y.setValue(str3110);
                                            break;
                                        case 4:
                                            kVar.y.setValue(str3110);
                                            break;
                                        default:
                                            kVar.y.setValue(str3110);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            this.e = null;
                            this.y = null;
                            this.C = i3;
                            this.D = i4;
                            this.E = 16;
                            if (lVar3.o(str16, r3, this) == aVar) {
                                return aVar;
                            }
                            i6 = i3;
                            i2 = i10;
                            com.app.mlounge.data.local.prefs.y1 y1Var11111114 = kVar.b;
                            if (i2 != 0) {
                                z = i10;
                            } else {
                                z = 0;
                            }
                            this.e = null;
                            this.y = null;
                            this.z = null;
                            this.A = null;
                            this.B = null;
                            this.C = i6;
                            this.D = i2;
                            this.E = 23;
                            objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var11111114.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                            if (objS3 == aVar) {
                                objS3 = yVar;
                            }
                            if (objS3 == aVar) {
                                return aVar;
                            }
                            MutableStateFlow mutableStateFlow111113 = kVar.y;
                            if (i2 != 0) {
                                str27 = " + EPG";
                            } else {
                                str27 = "";
                            }
                            mutableStateFlow111113.setValue("Done! " + i6 + " channels" + str27);
                            return yVar;
                        }
                        i2 = i4;
                        i6 = i3;
                        com.app.mlounge.data.local.prefs.y1 y1Var11111115 = kVar.b;
                        if (i2 != 0) {
                            z = i10;
                        } else {
                            z = 0;
                        }
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i6;
                        this.D = i2;
                        this.E = 23;
                        objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var11111115.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                        if (objS3 == aVar) {
                            objS3 = yVar;
                        }
                        if (objS3 == aVar) {
                            return aVar;
                        }
                        MutableStateFlow mutableStateFlow111114 = kVar.y;
                        if (i2 != 0) {
                            str27 = " + EPG";
                        } else {
                            str27 = "";
                        }
                        mutableStateFlow111114.setValue("Done! " + i6 + " channels" + str27);
                        return yVar;
                    }
                    Flow flow11118 = kVar.b.Y;
                    this.e = null;
                    this.C = iIntValue;
                    this.D = 0;
                    this.E = 17;
                    objFirst8 = FlowKt.first(flow11118, this);
                    if (objFirst8 == aVar) {
                        return aVar;
                    }
                    i = iIntValue;
                    i2 = 0;
                    str17 = (String) objFirst8;
                    Flow flow11119 = kVar.b.Z;
                    this.e = null;
                    this.y = str17;
                    this.C = i;
                    this.D = i2;
                    this.E = 18;
                    objFirst11 = FlowKt.first(flow11119, this);
                    if (objFirst11 == aVar) {
                        return aVar;
                    }
                    str18 = str17;
                    i7 = i;
                    str19 = (String) objFirst11;
                    Flow flow111110 = kVar.b.a0;
                    this.e = null;
                    this.y = str18;
                    this.z = str19;
                    this.C = i7;
                    this.D = i2;
                    this.E = 19;
                    objFirst12 = FlowKt.first(flow111110, this);
                    if (objFirst12 == aVar) {
                        return aVar;
                    }
                    str20 = (String) objFirst12;
                    Flow flow111111 = kVar.b.b0;
                    this.e = null;
                    this.y = str18;
                    this.z = str19;
                    this.A = str20;
                    this.C = i7;
                    this.D = i2;
                    this.E = 20;
                    objFirst13 = FlowKt.first(flow111111, this);
                    if (objFirst13 == aVar) {
                        return aVar;
                    }
                    str21 = str18;
                    str22 = str20;
                    str23 = (String) objFirst13;
                    Flow flowF11 = kVar.b.f();
                    this.e = null;
                    this.y = str21;
                    this.z = str19;
                    this.A = str22;
                    this.B = str23;
                    this.C = i7;
                    this.D = i2;
                    this.E = 21;
                    objFirst14 = FlowKt.first(flowF11, this);
                    if (objFirst14 == aVar) {
                        return aVar;
                    }
                    String str3110 = str21;
                    i8 = i7;
                    str24 = str3110;
                    String str3111 = str22;
                    str25 = str23;
                    str26 = str3111;
                    if (((Boolean) objFirst14).booleanValue()) {
                        kVar.y.setValue("Trying built-in EPG feed...");
                        com.app.mlounge.data.iptv.l lVar111 = kVar.c;
                        if (kotlin.text.k.d0(str19)) {
                            str19 = null;
                        }
                        final int i11119 = 5;
                        ?? r112 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                            @Override // kotlin.jvm.functions.l
                            public final Object invoke(Object obj2) {
                                String str3112 = (String) obj2;
                                switch (i11119) {
                                    case 0:
                                        kVar.y.setValue(str3112);
                                        break;
                                    case 1:
                                        kVar.y.setValue(str3112);
                                        break;
                                    case 2:
                                        kVar.y.setValue(str3112);
                                        break;
                                    case 3:
                                        kVar.y.setValue(str3112);
                                        break;
                                    case 4:
                                        kVar.y.setValue(str3112);
                                        break;
                                    default:
                                        kVar.y.setValue(str3112);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i8;
                        this.D = i2;
                        this.E = 22;
                        objK = lVar111.k(str24, str19, str26, str25, r112, this);
                        if (objK == aVar) {
                            return aVar;
                        }
                        i2 = !((Map) objK).isEmpty() ? 1 : 0;
                    }
                    i6 = i8;
                    com.app.mlounge.data.local.prefs.y1 y1Var11111116 = kVar.b;
                    if (i2 != 0) {
                        z = i10;
                    } else {
                        z = 0;
                    }
                    this.e = null;
                    this.y = null;
                    this.z = null;
                    this.A = null;
                    this.B = null;
                    this.C = i6;
                    this.D = i2;
                    this.E = 23;
                    objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var11111116.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                    if (objS3 == aVar) {
                        objS3 = yVar;
                    }
                    if (objS3 == aVar) {
                        return aVar;
                    }
                    MutableStateFlow mutableStateFlow111115 = kVar.y;
                    if (i2 != 0) {
                        str27 = " + EPG";
                    } else {
                        str27 = "";
                    }
                    mutableStateFlow111115.setValue("Done! " + i6 + " channels" + str27);
                    return yVar;
                case 12:
                    iIntValue = this.C;
                    str14 = this.e;
                    kotlin.a.e(obj);
                    str11 = "EPG failed (channels saved): ";
                    aVar = aVar2;
                    i10 = 1;
                    if (kotlin.jvm.internal.l.a(str14, "m3u")) {
                        Flow flowA12 = kVar.b.a();
                        this.e = null;
                        this.C = iIntValue;
                        this.D = 0;
                        this.E = 13;
                        objFirst10 = FlowKt.first(flowA12, this);
                        if (objFirst10 == aVar) {
                            return aVar;
                        }
                        i3 = iIntValue;
                        i4 = 0;
                        str15 = (String) objFirst10;
                        if (!kotlin.text.k.d0(str15)) {
                            kVar.y.setValue("Downloading EPG...");
                            lVar = kVar.c;
                            final int i111110 = 3;
                            lVar2 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                @Override // kotlin.jvm.functions.l
                                public final Object invoke(Object obj2) {
                                    String str3112 = (String) obj2;
                                    switch (i111110) {
                                        case 0:
                                            kVar.y.setValue(str3112);
                                            break;
                                        case 1:
                                            kVar.y.setValue(str3112);
                                            break;
                                        case 2:
                                            kVar.y.setValue(str3112);
                                            break;
                                        case 3:
                                            kVar.y.setValue(str3112);
                                            break;
                                        case 4:
                                            kVar.y.setValue(str3112);
                                            break;
                                        default:
                                            kVar.y.setValue(str3112);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            this.e = null;
                            this.y = null;
                            this.C = i3;
                            this.D = i4;
                            this.E = 14;
                            lVar.getClass();
                            if (BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.iptv.b(lVar2, str15, lVar, null), this) == aVar) {
                                return aVar;
                            }
                            i6 = i3;
                            i2 = i10;
                            com.app.mlounge.data.local.prefs.y1 y1Var11111117 = kVar.b;
                            if (i2 != 0) {
                                z = i10;
                            } else {
                                z = 0;
                            }
                            this.e = null;
                            this.y = null;
                            this.z = null;
                            this.A = null;
                            this.B = null;
                            this.C = i6;
                            this.D = i2;
                            this.E = 23;
                            objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var11111117.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                            if (objS3 == aVar) {
                                objS3 = yVar;
                            }
                            if (objS3 == aVar) {
                                return aVar;
                            }
                            MutableStateFlow mutableStateFlow111116 = kVar.y;
                            if (i2 != 0) {
                                str27 = " + EPG";
                            } else {
                                str27 = "";
                            }
                            mutableStateFlow111116.setValue("Done! " + i6 + " channels" + str27);
                            return yVar;
                        }
                        i2 = i4;
                        i6 = i3;
                        com.app.mlounge.data.local.prefs.y1 y1Var11111118 = kVar.b;
                        if (i2 != 0) {
                            z = i10;
                        } else {
                            z = 0;
                        }
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i6;
                        this.D = i2;
                        this.E = 23;
                        objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var11111118.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                        if (objS3 == aVar) {
                            objS3 = yVar;
                        }
                        if (objS3 == aVar) {
                            return aVar;
                        }
                        MutableStateFlow mutableStateFlow111117 = kVar.y;
                        if (i2 != 0) {
                            str27 = " + EPG";
                        } else {
                            str27 = "";
                        }
                        mutableStateFlow111117.setValue("Done! " + i6 + " channels" + str27);
                        return yVar;
                    }
                    if (kotlin.jvm.internal.l.a(str14, "local")) {
                        Flow flowB12 = kVar.b.b();
                        this.e = null;
                        this.C = iIntValue;
                        this.D = 0;
                        this.E = 15;
                        objFirst9 = FlowKt.first(flowB12, this);
                        if (objFirst9 == aVar) {
                            return aVar;
                        }
                        i3 = iIntValue;
                        i4 = 0;
                        str16 = (String) objFirst9;
                        if (!kotlin.text.k.d0(str16)) {
                            kVar.y.setValue("Syncing local EPG...");
                            lVar3 = kVar.c;
                            final int i111111 = 4;
                            r3 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                                @Override // kotlin.jvm.functions.l
                                public final Object invoke(Object obj2) {
                                    String str3112 = (String) obj2;
                                    switch (i111111) {
                                        case 0:
                                            kVar.y.setValue(str3112);
                                            break;
                                        case 1:
                                            kVar.y.setValue(str3112);
                                            break;
                                        case 2:
                                            kVar.y.setValue(str3112);
                                            break;
                                        case 3:
                                            kVar.y.setValue(str3112);
                                            break;
                                        case 4:
                                            kVar.y.setValue(str3112);
                                            break;
                                        default:
                                            kVar.y.setValue(str3112);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            this.e = null;
                            this.y = null;
                            this.C = i3;
                            this.D = i4;
                            this.E = 16;
                            if (lVar3.o(str16, r3, this) == aVar) {
                                return aVar;
                            }
                            i6 = i3;
                            i2 = i10;
                            com.app.mlounge.data.local.prefs.y1 y1Var11111119 = kVar.b;
                            if (i2 != 0) {
                                z = i10;
                            } else {
                                z = 0;
                            }
                            this.e = null;
                            this.y = null;
                            this.z = null;
                            this.A = null;
                            this.B = null;
                            this.C = i6;
                            this.D = i2;
                            this.E = 23;
                            objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var11111119.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                            if (objS3 == aVar) {
                                objS3 = yVar;
                            }
                            if (objS3 == aVar) {
                                return aVar;
                            }
                            MutableStateFlow mutableStateFlow111118 = kVar.y;
                            if (i2 != 0) {
                                str27 = " + EPG";
                            } else {
                                str27 = "";
                            }
                            mutableStateFlow111118.setValue("Done! " + i6 + " channels" + str27);
                            return yVar;
                        }
                        i2 = i4;
                        i6 = i3;
                        com.app.mlounge.data.local.prefs.y1 y1Var111111110 = kVar.b;
                        if (i2 != 0) {
                            z = i10;
                        } else {
                            z = 0;
                        }
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i6;
                        this.D = i2;
                        this.E = 23;
                        objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var111111110.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                        if (objS3 == aVar) {
                            objS3 = yVar;
                        }
                        if (objS3 == aVar) {
                            return aVar;
                        }
                        MutableStateFlow mutableStateFlow111119 = kVar.y;
                        if (i2 != 0) {
                            str27 = " + EPG";
                        } else {
                            str27 = "";
                        }
                        mutableStateFlow111119.setValue("Done! " + i6 + " channels" + str27);
                        return yVar;
                    }
                    Flow flow111112 = kVar.b.Y;
                    this.e = null;
                    this.C = iIntValue;
                    this.D = 0;
                    this.E = 17;
                    objFirst8 = FlowKt.first(flow111112, this);
                    if (objFirst8 == aVar) {
                        return aVar;
                    }
                    i = iIntValue;
                    i2 = 0;
                    str17 = (String) objFirst8;
                    Flow flow111113 = kVar.b.Z;
                    this.e = null;
                    this.y = str17;
                    this.C = i;
                    this.D = i2;
                    this.E = 18;
                    objFirst11 = FlowKt.first(flow111113, this);
                    if (objFirst11 == aVar) {
                        return aVar;
                    }
                    str18 = str17;
                    i7 = i;
                    str19 = (String) objFirst11;
                    Flow flow111114 = kVar.b.a0;
                    this.e = null;
                    this.y = str18;
                    this.z = str19;
                    this.C = i7;
                    this.D = i2;
                    this.E = 19;
                    objFirst12 = FlowKt.first(flow111114, this);
                    if (objFirst12 == aVar) {
                        return aVar;
                    }
                    str20 = (String) objFirst12;
                    Flow flow111115 = kVar.b.b0;
                    this.e = null;
                    this.y = str18;
                    this.z = str19;
                    this.A = str20;
                    this.C = i7;
                    this.D = i2;
                    this.E = 20;
                    objFirst13 = FlowKt.first(flow111115, this);
                    if (objFirst13 == aVar) {
                        return aVar;
                    }
                    str21 = str18;
                    str22 = str20;
                    str23 = (String) objFirst13;
                    Flow flowF12 = kVar.b.f();
                    this.e = null;
                    this.y = str21;
                    this.z = str19;
                    this.A = str22;
                    this.B = str23;
                    this.C = i7;
                    this.D = i2;
                    this.E = 21;
                    objFirst14 = FlowKt.first(flowF12, this);
                    if (objFirst14 == aVar) {
                        return aVar;
                    }
                    String str3112 = str21;
                    i8 = i7;
                    str24 = str3112;
                    String str3113 = str22;
                    str25 = str23;
                    str26 = str3113;
                    if (((Boolean) objFirst14).booleanValue()) {
                        kVar.y.setValue("Trying built-in EPG feed...");
                        com.app.mlounge.data.iptv.l lVar112 = kVar.c;
                        if (kotlin.text.k.d0(str19)) {
                            str19 = null;
                        }
                        final int i111112 = 5;
                        ?? r113 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                            @Override // kotlin.jvm.functions.l
                            public final Object invoke(Object obj2) {
                                String str3114 = (String) obj2;
                                switch (i111112) {
                                    case 0:
                                        kVar.y.setValue(str3114);
                                        break;
                                    case 1:
                                        kVar.y.setValue(str3114);
                                        break;
                                    case 2:
                                        kVar.y.setValue(str3114);
                                        break;
                                    case 3:
                                        kVar.y.setValue(str3114);
                                        break;
                                    case 4:
                                        kVar.y.setValue(str3114);
                                        break;
                                    default:
                                        kVar.y.setValue(str3114);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i8;
                        this.D = i2;
                        this.E = 22;
                        objK = lVar112.k(str24, str19, str26, str25, r113, this);
                        if (objK == aVar) {
                            return aVar;
                        }
                        i2 = !((Map) objK).isEmpty() ? 1 : 0;
                    }
                    i6 = i8;
                    com.app.mlounge.data.local.prefs.y1 y1Var111111111 = kVar.b;
                    if (i2 != 0) {
                        z = i10;
                    } else {
                        z = 0;
                    }
                    this.e = null;
                    this.y = null;
                    this.z = null;
                    this.A = null;
                    this.B = null;
                    this.C = i6;
                    this.D = i2;
                    this.E = 23;
                    objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var111111111.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                    if (objS3 == aVar) {
                        objS3 = yVar;
                    }
                    if (objS3 == aVar) {
                        return aVar;
                    }
                    MutableStateFlow mutableStateFlow1111110 = kVar.y;
                    if (i2 != 0) {
                        str27 = " + EPG";
                    } else {
                        str27 = "";
                    }
                    mutableStateFlow1111110.setValue("Done! " + i6 + " channels" + str27);
                    return yVar;
                case 13:
                    int i20 = this.D;
                    int i21 = this.C;
                    kotlin.a.e(obj);
                    i3 = i21;
                    str11 = "EPG failed (channels saved): ";
                    aVar = aVar2;
                    i10 = 1;
                    objFirst10 = obj;
                    i4 = i20;
                    str15 = (String) objFirst10;
                    if (!kotlin.text.k.d0(str15)) {
                        kVar.y.setValue("Downloading EPG...");
                        lVar = kVar.c;
                        final int i111113 = 3;
                        lVar2 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                            @Override // kotlin.jvm.functions.l
                            public final Object invoke(Object obj2) {
                                String str3114 = (String) obj2;
                                switch (i111113) {
                                    case 0:
                                        kVar.y.setValue(str3114);
                                        break;
                                    case 1:
                                        kVar.y.setValue(str3114);
                                        break;
                                    case 2:
                                        kVar.y.setValue(str3114);
                                        break;
                                    case 3:
                                        kVar.y.setValue(str3114);
                                        break;
                                    case 4:
                                        kVar.y.setValue(str3114);
                                        break;
                                    default:
                                        kVar.y.setValue(str3114);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        this.e = null;
                        this.y = null;
                        this.C = i3;
                        this.D = i4;
                        this.E = 14;
                        lVar.getClass();
                        if (BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.iptv.b(lVar2, str15, lVar, null), this) == aVar) {
                            return aVar;
                        }
                        i6 = i3;
                        i2 = i10;
                        com.app.mlounge.data.local.prefs.y1 y1Var111111112 = kVar.b;
                        if (i2 != 0) {
                            z = i10;
                        } else {
                            z = 0;
                        }
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i6;
                        this.D = i2;
                        this.E = 23;
                        objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var111111112.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                        if (objS3 == aVar) {
                            objS3 = yVar;
                        }
                        if (objS3 == aVar) {
                            return aVar;
                        }
                        MutableStateFlow mutableStateFlow1111111 = kVar.y;
                        if (i2 != 0) {
                            str27 = " + EPG";
                        } else {
                            str27 = "";
                        }
                        mutableStateFlow1111111.setValue("Done! " + i6 + " channels" + str27);
                        return yVar;
                    }
                    i2 = i4;
                    i6 = i3;
                    com.app.mlounge.data.local.prefs.y1 y1Var111111113 = kVar.b;
                    if (i2 != 0) {
                        z = i10;
                    } else {
                        z = 0;
                    }
                    this.e = null;
                    this.y = null;
                    this.z = null;
                    this.A = null;
                    this.B = null;
                    this.C = i6;
                    this.D = i2;
                    this.E = 23;
                    objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var111111113.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                    if (objS3 == aVar) {
                        objS3 = yVar;
                    }
                    if (objS3 == aVar) {
                        return aVar;
                    }
                    MutableStateFlow mutableStateFlow1111112 = kVar.y;
                    if (i2 != 0) {
                        str27 = " + EPG";
                    } else {
                        str27 = "";
                    }
                    mutableStateFlow1111112.setValue("Done! " + i6 + " channels" + str27);
                    return yVar;
                case 14:
                    i5 = this.D;
                    i3 = this.C;
                    try {
                        kotlin.a.e(obj);
                        aVar = aVar2;
                        i10 = 1;
                        i6 = i3;
                        i2 = i10;
                    } catch (Exception e3) {
                        e = e3;
                        str11 = "EPG failed (channels saved): ";
                        aVar = aVar2;
                        i10 = 1;
                        kVar.y.setValue(str11 + e.getMessage());
                        i2 = i5;
                        i6 = i3;
                    }
                    com.app.mlounge.data.local.prefs.y1 y1Var111111114 = kVar.b;
                    if (i2 != 0) {
                        z = i10;
                    } else {
                        z = 0;
                    }
                    this.e = null;
                    this.y = null;
                    this.z = null;
                    this.A = null;
                    this.B = null;
                    this.C = i6;
                    this.D = i2;
                    this.E = 23;
                    objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var111111114.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                    if (objS3 == aVar) {
                        objS3 = yVar;
                    }
                    if (objS3 == aVar) {
                        return aVar;
                    }
                    MutableStateFlow mutableStateFlow1111113 = kVar.y;
                    if (i2 != 0) {
                        str27 = " + EPG";
                    } else {
                        str27 = "";
                    }
                    mutableStateFlow1111113.setValue("Done! " + i6 + " channels" + str27);
                    return yVar;
                case 15:
                    int i22 = this.D;
                    int i23 = this.C;
                    kotlin.a.e(obj);
                    i3 = i23;
                    str11 = "EPG failed (channels saved): ";
                    aVar = aVar2;
                    i10 = 1;
                    objFirst9 = obj;
                    i4 = i22;
                    str16 = (String) objFirst9;
                    if (!kotlin.text.k.d0(str16)) {
                        kVar.y.setValue("Syncing local EPG...");
                        lVar3 = kVar.c;
                        final int i111114 = 4;
                        r3 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                            @Override // kotlin.jvm.functions.l
                            public final Object invoke(Object obj2) {
                                String str3114 = (String) obj2;
                                switch (i111114) {
                                    case 0:
                                        kVar.y.setValue(str3114);
                                        break;
                                    case 1:
                                        kVar.y.setValue(str3114);
                                        break;
                                    case 2:
                                        kVar.y.setValue(str3114);
                                        break;
                                    case 3:
                                        kVar.y.setValue(str3114);
                                        break;
                                    case 4:
                                        kVar.y.setValue(str3114);
                                        break;
                                    default:
                                        kVar.y.setValue(str3114);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        this.e = null;
                        this.y = null;
                        this.C = i3;
                        this.D = i4;
                        this.E = 16;
                        if (lVar3.o(str16, r3, this) == aVar) {
                            return aVar;
                        }
                        i6 = i3;
                        i2 = i10;
                        com.app.mlounge.data.local.prefs.y1 y1Var111111115 = kVar.b;
                        if (i2 != 0) {
                            z = i10;
                        } else {
                            z = 0;
                        }
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i6;
                        this.D = i2;
                        this.E = 23;
                        objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var111111115.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                        if (objS3 == aVar) {
                            objS3 = yVar;
                        }
                        if (objS3 == aVar) {
                            return aVar;
                        }
                        MutableStateFlow mutableStateFlow1111114 = kVar.y;
                        if (i2 != 0) {
                            str27 = " + EPG";
                        } else {
                            str27 = "";
                        }
                        mutableStateFlow1111114.setValue("Done! " + i6 + " channels" + str27);
                        return yVar;
                    }
                    i2 = i4;
                    i6 = i3;
                    com.app.mlounge.data.local.prefs.y1 y1Var111111116 = kVar.b;
                    if (i2 != 0) {
                        z = i10;
                    } else {
                        z = 0;
                    }
                    this.e = null;
                    this.y = null;
                    this.z = null;
                    this.A = null;
                    this.B = null;
                    this.C = i6;
                    this.D = i2;
                    this.E = 23;
                    objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var111111116.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                    if (objS3 == aVar) {
                        objS3 = yVar;
                    }
                    if (objS3 == aVar) {
                        return aVar;
                    }
                    MutableStateFlow mutableStateFlow1111115 = kVar.y;
                    if (i2 != 0) {
                        str27 = " + EPG";
                    } else {
                        str27 = "";
                    }
                    mutableStateFlow1111115.setValue("Done! " + i6 + " channels" + str27);
                    return yVar;
                case 16:
                    i5 = this.D;
                    i3 = this.C;
                    try {
                        kotlin.a.e(obj);
                        aVar = aVar2;
                        i10 = 1;
                        i6 = i3;
                        i2 = i10;
                    } catch (Exception e4) {
                        e = e4;
                        str11 = "EPG failed (channels saved): ";
                        aVar = aVar2;
                        i10 = 1;
                        kVar.y.setValue(str11 + e.getMessage());
                        i2 = i5;
                        i6 = i3;
                    }
                    com.app.mlounge.data.local.prefs.y1 y1Var111111117 = kVar.b;
                    if (i2 != 0) {
                        z = i10;
                    } else {
                        z = 0;
                    }
                    this.e = null;
                    this.y = null;
                    this.z = null;
                    this.A = null;
                    this.B = null;
                    this.C = i6;
                    this.D = i2;
                    this.E = 23;
                    objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var111111117.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                    if (objS3 == aVar) {
                        objS3 = yVar;
                    }
                    if (objS3 == aVar) {
                        return aVar;
                    }
                    MutableStateFlow mutableStateFlow1111116 = kVar.y;
                    if (i2 != 0) {
                        str27 = " + EPG";
                    } else {
                        str27 = "";
                    }
                    mutableStateFlow1111116.setValue("Done! " + i6 + " channels" + str27);
                    return yVar;
                case 17:
                    i2 = this.D;
                    int i24 = this.C;
                    kotlin.a.e(obj);
                    i = i24;
                    aVar = aVar2;
                    i10 = 1;
                    objFirst8 = obj;
                    str17 = (String) objFirst8;
                    Flow flow111116 = kVar.b.Z;
                    this.e = null;
                    this.y = str17;
                    this.C = i;
                    this.D = i2;
                    this.E = 18;
                    objFirst11 = FlowKt.first(flow111116, this);
                    if (objFirst11 == aVar) {
                        return aVar;
                    }
                    str18 = str17;
                    i7 = i;
                    str19 = (String) objFirst11;
                    Flow flow111117 = kVar.b.a0;
                    this.e = null;
                    this.y = str18;
                    this.z = str19;
                    this.C = i7;
                    this.D = i2;
                    this.E = 19;
                    objFirst12 = FlowKt.first(flow111117, this);
                    if (objFirst12 == aVar) {
                        return aVar;
                    }
                    str20 = (String) objFirst12;
                    Flow flow111118 = kVar.b.b0;
                    this.e = null;
                    this.y = str18;
                    this.z = str19;
                    this.A = str20;
                    this.C = i7;
                    this.D = i2;
                    this.E = 20;
                    objFirst13 = FlowKt.first(flow111118, this);
                    if (objFirst13 == aVar) {
                        return aVar;
                    }
                    str21 = str18;
                    str22 = str20;
                    str23 = (String) objFirst13;
                    Flow flowF13 = kVar.b.f();
                    this.e = null;
                    this.y = str21;
                    this.z = str19;
                    this.A = str22;
                    this.B = str23;
                    this.C = i7;
                    this.D = i2;
                    this.E = 21;
                    objFirst14 = FlowKt.first(flowF13, this);
                    if (objFirst14 == aVar) {
                        return aVar;
                    }
                    String str3114 = str21;
                    i8 = i7;
                    str24 = str3114;
                    String str3115 = str22;
                    str25 = str23;
                    str26 = str3115;
                    if (((Boolean) objFirst14).booleanValue()) {
                        kVar.y.setValue("Trying built-in EPG feed...");
                        com.app.mlounge.data.iptv.l lVar113 = kVar.c;
                        if (kotlin.text.k.d0(str19)) {
                            str19 = null;
                        }
                        final int i111115 = 5;
                        ?? r114 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                            @Override // kotlin.jvm.functions.l
                            public final Object invoke(Object obj2) {
                                String str3116 = (String) obj2;
                                switch (i111115) {
                                    case 0:
                                        kVar.y.setValue(str3116);
                                        break;
                                    case 1:
                                        kVar.y.setValue(str3116);
                                        break;
                                    case 2:
                                        kVar.y.setValue(str3116);
                                        break;
                                    case 3:
                                        kVar.y.setValue(str3116);
                                        break;
                                    case 4:
                                        kVar.y.setValue(str3116);
                                        break;
                                    default:
                                        kVar.y.setValue(str3116);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i8;
                        this.D = i2;
                        this.E = 22;
                        objK = lVar113.k(str24, str19, str26, str25, r114, this);
                        if (objK == aVar) {
                            return aVar;
                        }
                        i2 = !((Map) objK).isEmpty() ? 1 : 0;
                    }
                    i6 = i8;
                    com.app.mlounge.data.local.prefs.y1 y1Var111111118 = kVar.b;
                    if (i2 != 0) {
                        z = i10;
                    } else {
                        z = 0;
                    }
                    this.e = null;
                    this.y = null;
                    this.z = null;
                    this.A = null;
                    this.B = null;
                    this.C = i6;
                    this.D = i2;
                    this.E = 23;
                    objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var111111118.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                    if (objS3 == aVar) {
                        objS3 = yVar;
                    }
                    if (objS3 == aVar) {
                        return aVar;
                    }
                    MutableStateFlow mutableStateFlow1111117 = kVar.y;
                    if (i2 != 0) {
                        str27 = " + EPG";
                    } else {
                        str27 = "";
                    }
                    mutableStateFlow1111117.setValue("Done! " + i6 + " channels" + str27);
                    return yVar;
                case 18:
                    i2 = this.D;
                    i7 = this.C;
                    String str49 = this.y;
                    kotlin.a.e(obj);
                    str18 = str49;
                    aVar = aVar2;
                    i10 = 1;
                    objFirst11 = obj;
                    str19 = (String) objFirst11;
                    Flow flow111119 = kVar.b.a0;
                    this.e = null;
                    this.y = str18;
                    this.z = str19;
                    this.C = i7;
                    this.D = i2;
                    this.E = 19;
                    objFirst12 = FlowKt.first(flow111119, this);
                    if (objFirst12 == aVar) {
                        return aVar;
                    }
                    str20 = (String) objFirst12;
                    Flow flow1111110 = kVar.b.b0;
                    this.e = null;
                    this.y = str18;
                    this.z = str19;
                    this.A = str20;
                    this.C = i7;
                    this.D = i2;
                    this.E = 20;
                    objFirst13 = FlowKt.first(flow1111110, this);
                    if (objFirst13 == aVar) {
                        return aVar;
                    }
                    str21 = str18;
                    str22 = str20;
                    str23 = (String) objFirst13;
                    Flow flowF14 = kVar.b.f();
                    this.e = null;
                    this.y = str21;
                    this.z = str19;
                    this.A = str22;
                    this.B = str23;
                    this.C = i7;
                    this.D = i2;
                    this.E = 21;
                    objFirst14 = FlowKt.first(flowF14, this);
                    if (objFirst14 == aVar) {
                        return aVar;
                    }
                    String str3116 = str21;
                    i8 = i7;
                    str24 = str3116;
                    String str3117 = str22;
                    str25 = str23;
                    str26 = str3117;
                    if (((Boolean) objFirst14).booleanValue()) {
                        kVar.y.setValue("Trying built-in EPG feed...");
                        com.app.mlounge.data.iptv.l lVar114 = kVar.c;
                        if (kotlin.text.k.d0(str19)) {
                            str19 = null;
                        }
                        final int i111116 = 5;
                        ?? r115 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                            @Override // kotlin.jvm.functions.l
                            public final Object invoke(Object obj2) {
                                String str3118 = (String) obj2;
                                switch (i111116) {
                                    case 0:
                                        kVar.y.setValue(str3118);
                                        break;
                                    case 1:
                                        kVar.y.setValue(str3118);
                                        break;
                                    case 2:
                                        kVar.y.setValue(str3118);
                                        break;
                                    case 3:
                                        kVar.y.setValue(str3118);
                                        break;
                                    case 4:
                                        kVar.y.setValue(str3118);
                                        break;
                                    default:
                                        kVar.y.setValue(str3118);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i8;
                        this.D = i2;
                        this.E = 22;
                        objK = lVar114.k(str24, str19, str26, str25, r115, this);
                        if (objK == aVar) {
                            return aVar;
                        }
                        i2 = !((Map) objK).isEmpty() ? 1 : 0;
                    }
                    i6 = i8;
                    com.app.mlounge.data.local.prefs.y1 y1Var111111119 = kVar.b;
                    if (i2 != 0) {
                        z = i10;
                    } else {
                        z = 0;
                    }
                    this.e = null;
                    this.y = null;
                    this.z = null;
                    this.A = null;
                    this.B = null;
                    this.C = i6;
                    this.D = i2;
                    this.E = 23;
                    objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var111111119.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                    if (objS3 == aVar) {
                        objS3 = yVar;
                    }
                    if (objS3 == aVar) {
                        return aVar;
                    }
                    MutableStateFlow mutableStateFlow1111118 = kVar.y;
                    if (i2 != 0) {
                        str27 = " + EPG";
                    } else {
                        str27 = "";
                    }
                    mutableStateFlow1111118.setValue("Done! " + i6 + " channels" + str27);
                    return yVar;
                case 19:
                    i2 = this.D;
                    i7 = this.C;
                    str19 = this.z;
                    str18 = this.y;
                    kotlin.a.e(obj);
                    aVar = aVar2;
                    i10 = 1;
                    objFirst12 = obj;
                    str20 = (String) objFirst12;
                    Flow flow1111111 = kVar.b.b0;
                    this.e = null;
                    this.y = str18;
                    this.z = str19;
                    this.A = str20;
                    this.C = i7;
                    this.D = i2;
                    this.E = 20;
                    objFirst13 = FlowKt.first(flow1111111, this);
                    if (objFirst13 == aVar) {
                        return aVar;
                    }
                    str21 = str18;
                    str22 = str20;
                    str23 = (String) objFirst13;
                    Flow flowF15 = kVar.b.f();
                    this.e = null;
                    this.y = str21;
                    this.z = str19;
                    this.A = str22;
                    this.B = str23;
                    this.C = i7;
                    this.D = i2;
                    this.E = 21;
                    objFirst14 = FlowKt.first(flowF15, this);
                    if (objFirst14 == aVar) {
                        return aVar;
                    }
                    String str3118 = str21;
                    i8 = i7;
                    str24 = str3118;
                    String str3119 = str22;
                    str25 = str23;
                    str26 = str3119;
                    if (((Boolean) objFirst14).booleanValue()) {
                        kVar.y.setValue("Trying built-in EPG feed...");
                        com.app.mlounge.data.iptv.l lVar115 = kVar.c;
                        if (kotlin.text.k.d0(str19)) {
                            str19 = null;
                        }
                        final int i111117 = 5;
                        ?? r116 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                            @Override // kotlin.jvm.functions.l
                            public final Object invoke(Object obj2) {
                                String str31110 = (String) obj2;
                                switch (i111117) {
                                    case 0:
                                        kVar.y.setValue(str31110);
                                        break;
                                    case 1:
                                        kVar.y.setValue(str31110);
                                        break;
                                    case 2:
                                        kVar.y.setValue(str31110);
                                        break;
                                    case 3:
                                        kVar.y.setValue(str31110);
                                        break;
                                    case 4:
                                        kVar.y.setValue(str31110);
                                        break;
                                    default:
                                        kVar.y.setValue(str31110);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i8;
                        this.D = i2;
                        this.E = 22;
                        objK = lVar115.k(str24, str19, str26, str25, r116, this);
                        if (objK == aVar) {
                            return aVar;
                        }
                        i2 = !((Map) objK).isEmpty() ? 1 : 0;
                    }
                    i6 = i8;
                    com.app.mlounge.data.local.prefs.y1 y1Var1111111110 = kVar.b;
                    if (i2 != 0) {
                        z = i10;
                    } else {
                        z = 0;
                    }
                    this.e = null;
                    this.y = null;
                    this.z = null;
                    this.A = null;
                    this.B = null;
                    this.C = i6;
                    this.D = i2;
                    this.E = 23;
                    objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var1111111110.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                    if (objS3 == aVar) {
                        objS3 = yVar;
                    }
                    if (objS3 == aVar) {
                        return aVar;
                    }
                    MutableStateFlow mutableStateFlow1111119 = kVar.y;
                    if (i2 != 0) {
                        str27 = " + EPG";
                    } else {
                        str27 = "";
                    }
                    mutableStateFlow1111119.setValue("Done! " + i6 + " channels" + str27);
                    return yVar;
                case 20:
                    i2 = this.D;
                    i7 = this.C;
                    String str50 = this.A;
                    String str51 = this.z;
                    String str52 = this.y;
                    kotlin.a.e(obj);
                    str22 = str50;
                    str19 = str51;
                    aVar = aVar2;
                    str21 = str52;
                    i10 = 1;
                    objFirst13 = obj;
                    str23 = (String) objFirst13;
                    Flow flowF16 = kVar.b.f();
                    this.e = null;
                    this.y = str21;
                    this.z = str19;
                    this.A = str22;
                    this.B = str23;
                    this.C = i7;
                    this.D = i2;
                    this.E = 21;
                    objFirst14 = FlowKt.first(flowF16, this);
                    if (objFirst14 == aVar) {
                        return aVar;
                    }
                    String str31110 = str21;
                    i8 = i7;
                    str24 = str31110;
                    String str31111 = str22;
                    str25 = str23;
                    str26 = str31111;
                    if (((Boolean) objFirst14).booleanValue()) {
                        kVar.y.setValue("Trying built-in EPG feed...");
                        com.app.mlounge.data.iptv.l lVar116 = kVar.c;
                        if (kotlin.text.k.d0(str19)) {
                            str19 = null;
                        }
                        final int i111118 = 5;
                        ?? r117 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                            @Override // kotlin.jvm.functions.l
                            public final Object invoke(Object obj2) {
                                String str31112 = (String) obj2;
                                switch (i111118) {
                                    case 0:
                                        kVar.y.setValue(str31112);
                                        break;
                                    case 1:
                                        kVar.y.setValue(str31112);
                                        break;
                                    case 2:
                                        kVar.y.setValue(str31112);
                                        break;
                                    case 3:
                                        kVar.y.setValue(str31112);
                                        break;
                                    case 4:
                                        kVar.y.setValue(str31112);
                                        break;
                                    default:
                                        kVar.y.setValue(str31112);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i8;
                        this.D = i2;
                        this.E = 22;
                        objK = lVar116.k(str24, str19, str26, str25, r117, this);
                        if (objK == aVar) {
                            return aVar;
                        }
                        i2 = !((Map) objK).isEmpty() ? 1 : 0;
                    }
                    i6 = i8;
                    com.app.mlounge.data.local.prefs.y1 y1Var1111111111 = kVar.b;
                    if (i2 != 0) {
                        z = i10;
                    } else {
                        z = 0;
                    }
                    this.e = null;
                    this.y = null;
                    this.z = null;
                    this.A = null;
                    this.B = null;
                    this.C = i6;
                    this.D = i2;
                    this.E = 23;
                    objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var1111111111.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                    if (objS3 == aVar) {
                        objS3 = yVar;
                    }
                    if (objS3 == aVar) {
                        return aVar;
                    }
                    MutableStateFlow mutableStateFlow11111110 = kVar.y;
                    if (i2 != 0) {
                        str27 = " + EPG";
                    } else {
                        str27 = "";
                    }
                    mutableStateFlow11111110.setValue("Done! " + i6 + " channels" + str27);
                    return yVar;
                case 21:
                    i2 = this.D;
                    int i25 = this.C;
                    String str53 = this.B;
                    String str54 = this.A;
                    String str55 = this.z;
                    String str56 = this.y;
                    kotlin.a.e(obj);
                    i8 = i25;
                    str24 = str56;
                    aVar = aVar2;
                    str26 = str54;
                    i10 = 1;
                    str25 = str53;
                    str19 = str55;
                    objFirst14 = obj;
                    if (((Boolean) objFirst14).booleanValue()) {
                        kVar.y.setValue("Trying built-in EPG feed...");
                        com.app.mlounge.data.iptv.l lVar117 = kVar.c;
                        if (kotlin.text.k.d0(str19)) {
                            str19 = null;
                        }
                        final int i111119 = 5;
                        ?? r118 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.viewmodel.h
                            @Override // kotlin.jvm.functions.l
                            public final Object invoke(Object obj2) {
                                String str31112 = (String) obj2;
                                switch (i111119) {
                                    case 0:
                                        kVar.y.setValue(str31112);
                                        break;
                                    case 1:
                                        kVar.y.setValue(str31112);
                                        break;
                                    case 2:
                                        kVar.y.setValue(str31112);
                                        break;
                                    case 3:
                                        kVar.y.setValue(str31112);
                                        break;
                                    case 4:
                                        kVar.y.setValue(str31112);
                                        break;
                                    default:
                                        kVar.y.setValue(str31112);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        this.e = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = i8;
                        this.D = i2;
                        this.E = 22;
                        objK = lVar117.k(str24, str19, str26, str25, r118, this);
                        if (objK == aVar) {
                            return aVar;
                        }
                        i2 = !((Map) objK).isEmpty() ? 1 : 0;
                    }
                    i6 = i8;
                    com.app.mlounge.data.local.prefs.y1 y1Var1111111112 = kVar.b;
                    if (i2 != 0) {
                        z = i10;
                    } else {
                        z = 0;
                    }
                    this.e = null;
                    this.y = null;
                    this.z = null;
                    this.A = null;
                    this.B = null;
                    this.C = i6;
                    this.D = i2;
                    this.E = 23;
                    objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var1111111112.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                    if (objS3 == aVar) {
                        objS3 = yVar;
                    }
                    if (objS3 == aVar) {
                        return aVar;
                    }
                    MutableStateFlow mutableStateFlow11111111 = kVar.y;
                    if (i2 != 0) {
                        str27 = " + EPG";
                    } else {
                        str27 = "";
                    }
                    mutableStateFlow11111111.setValue("Done! " + i6 + " channels" + str27);
                    return yVar;
                case 22:
                    int i26 = this.C;
                    kotlin.a.e(obj);
                    i8 = i26;
                    aVar = aVar2;
                    i10 = 1;
                    objK = obj;
                    i2 = !((Map) objK).isEmpty() ? 1 : 0;
                    i6 = i8;
                    com.app.mlounge.data.local.prefs.y1 y1Var1111111113 = kVar.b;
                    if (i2 != 0) {
                        z = i10;
                    } else {
                        z = 0;
                    }
                    this.e = null;
                    this.y = null;
                    this.z = null;
                    this.A = null;
                    this.B = null;
                    this.C = i6;
                    this.D = i2;
                    this.E = 23;
                    objS3 = android.support.v4.media.session.b.s(com.app.mlounge.data.local.prefs.z1.a(y1Var1111111113.a), new com.app.mlounge.data.local.prefs.c(z, null, 3), this);
                    if (objS3 == aVar) {
                        objS3 = yVar;
                    }
                    if (objS3 == aVar) {
                        return aVar;
                    }
                    MutableStateFlow mutableStateFlow11111112 = kVar.y;
                    if (i2 != 0) {
                        str27 = " + EPG";
                    } else {
                        str27 = "";
                    }
                    mutableStateFlow11111112.setValue("Done! " + i6 + " channels" + str27);
                    return yVar;
                case 23:
                    i2 = this.D;
                    i6 = this.C;
                    kotlin.a.e(obj);
                    MutableStateFlow mutableStateFlow11111113 = kVar.y;
                    if (i2 != 0) {
                        str27 = " + EPG";
                    } else {
                        str27 = "";
                    }
                    mutableStateFlow11111113.setValue("Done! " + i6 + " channels" + str27);
                    return yVar;
                default:
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Exception e5) {
            MutableStateFlow mutableStateFlow20 = kVar.A;
            String message = e5.getMessage();
            if (message == null) {
                message = "Download failed";
            }
            mutableStateFlow20.setValue(message);
            kVar.y.setValue("");
        } finally {
            kVar.w.setValue(kotlin.coroutines.jvm.internal.f.a(false));
        }
    }
}
