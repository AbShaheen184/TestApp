package org.mozilla.javascript.optimizer;

import jdk.dynalink.Operation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public enum RhinoOperation implements Operation {
    BIND,
    GETNOWARN,
    GETSUPER,
    GETWITHTHIS,
    GETWITHTHISOPTIONAL,
    GETELEMENT,
    GETELEMENTSUPER,
    GETINDEX,
    SETSTRICT,
    SETCONST,
    SETSUPER,
    SETELEMENT,
    SETELEMENTSUPER,
    SETINDEX,
    ADD,
    EQ,
    SHALLOWEQ,
    COMPARE_GT,
    COMPARE_LT,
    COMPARE_GE,
    COMPARE_LE,
    TOBOOLEAN,
    TOINT32,
    TOUINT32,
    TONUMBER,
    TONUMERIC
}
