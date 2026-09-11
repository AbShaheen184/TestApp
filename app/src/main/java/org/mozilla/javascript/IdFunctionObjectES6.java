package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class IdFunctionObjectES6 extends IdFunctionObject {
    private static final int Id_length = 1;
    private static final int Id_name = 3;
    private static final long serialVersionUID = -8023088662589035261L;
    private boolean myLength;
    private boolean myName;

    public IdFunctionObjectES6(IdFunctionCall idFunctionCall, Object obj, int i, String str, int i2, Scriptable scriptable) {
        super(idFunctionCall, obj, i, str, i2, scriptable);
        this.myLength = true;
        this.myName = true;
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.IdScriptableObject
    public int findInstanceIdInfo(String str) {
        if (str.equals("length")) {
            return IdScriptableObject.instanceIdInfo(3, 1);
        }
        return str.equals("name") ? IdScriptableObject.instanceIdInfo(3, 3) : super.findInstanceIdInfo(str);
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.IdScriptableObject
    public Object getInstanceIdValue(int i) {
        if (i != 1 || this.myLength) {
            return (i != 3 || this.myName) ? super.getInstanceIdValue(i) : Scriptable.NOT_FOUND;
        }
        return Scriptable.NOT_FOUND;
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.IdScriptableObject
    public void setInstanceIdValue(int i, Object obj) {
        if (i == 1 && obj == Scriptable.NOT_FOUND) {
            this.myLength = false;
        } else if (i == 3 && obj == Scriptable.NOT_FOUND) {
            this.myName = false;
        } else {
            super.setInstanceIdValue(i, obj);
        }
    }
}
