package androidx.documentfile.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import com.google.android.gms.dynamite.g;
import com.google.firebase.b;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends g {
    public final /* synthetic */ int p = 0;
    public Context q;
    public Uri r;

    public a(Context context, Uri uri) {
        this.q = context;
        this.r = uri;
    }

    public long G() {
        Cursor cursorQuery = null;
        try {
            cursorQuery = this.q.getContentResolver().query(this.r, new String[]{"_size"}, null, null, null);
            if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                return 0L;
            }
            return cursorQuery.getLong(0);
        } catch (Exception e) {
            Log.w("DocumentFile", "Failed query: " + e);
            return 0L;
        } finally {
            b.k(cursorQuery);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c A[LOOP:1: B:23:0x0069->B:25:0x006c, LOOP_END] */
    public g[] H() {
        Uri[] uriArr;
        g[] gVarArr;
        Context context = this.q;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = this.r;
        Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                try {
                    cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(DocumentsContract.buildDocumentUriUsingTree(uri, cursorQuery.getString(0)));
                    }
                    try {
                        c.t(cursorQuery);
                    } catch (RuntimeException e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    Log.w("DocumentFile", "Failed query: " + e2);
                    if (cursorQuery != null) {
                        try {
                            c.t(cursorQuery);
                        } catch (RuntimeException e3) {
                            throw e3;
                        }
                    }
                    uriArr = (Uri[]) arrayList.toArray(new Uri[0]);
                    gVarArr = new g[uriArr.length];
                    for (int i = 0; i < uriArr.length; i++) {
                        gVarArr[i] = new a(context, uriArr[i]);
                    }
                    return gVarArr;
                }
            } catch (Exception unused) {
            }
            uriArr = (Uri[]) arrayList.toArray(new Uri[0]);
            gVarArr = new g[uriArr.length];
            while (i < uriArr.length) {
                gVarArr[i] = new a(context, uriArr[i]);
            }
            return gVarArr;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                try {
                    c.t(cursorQuery);
                } catch (RuntimeException e4) {
                    throw e4;
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.dynamite.g
    public final boolean k() {
        switch (this.p) {
            case 0:
                try {
                    return DocumentsContract.deleteDocument(this.q.getContentResolver(), this.r);
                } catch (Exception unused) {
                    return false;
                }
            default:
                try {
                    return DocumentsContract.deleteDocument(this.q.getContentResolver(), this.r);
                } catch (Exception unused2) {
                    return false;
                }
        }
    }

    @Override // com.google.android.gms.dynamite.g
    public final String q() {
        switch (this.p) {
            case 0:
                break;
        }
        return b.H(this.q, this.r, "_display_name");
    }

    @Override // com.google.android.gms.dynamite.g
    public final Uri t() {
        switch (this.p) {
            case 0:
                break;
        }
        return this.r;
    }

    @Override // com.google.android.gms.dynamite.g
    public final boolean x() throws Throwable {
        switch (this.p) {
            case 0:
                String strH = b.H(this.q, this.r, "mime_type");
                return ("vnd.android.document/directory".equals(strH) || TextUtils.isEmpty(strH)) ? false : true;
            default:
                String strH2 = b.H(this.q, this.r, "mime_type");
                return ("vnd.android.document/directory".equals(strH2) || TextUtils.isEmpty(strH2)) ? false : true;
        }
    }

    public /* synthetic */ a() {
    }
}
