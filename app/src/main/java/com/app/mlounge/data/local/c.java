package com.app.mlounge.data.local;

import androidx.compose.runtime.snapshots.u;
import androidx.datastore.preferences.protobuf.h1;
import androidx.emoji2.text.g;
import androidx.room.f;
import androidx.room.i0;
import androidx.room.j;
import androidx.room.t;
import androidx.room.util.h;
import com.google.common.base.i;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.text.r;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends g {
    public final /* synthetic */ AppDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AppDatabase_Impl appDatabase_Impl) {
        super("6d8b217e013c2ca315f8e3487153e796", 8, "1710a304ac77dd2342fbc64de7fbaddb");
        this.d = appDatabase_Impl;
    }

    @Override // androidx.emoji2.text.g
    public final void c(androidx.sqlite.a aVar) {
        aVar.getClass();
        h1.l(aVar, "CREATE TABLE IF NOT EXISTS `watchlist` (`contentId` TEXT NOT NULL, `contentType` TEXT NOT NULL, `title` TEXT NOT NULL, `posterPath` TEXT, `backdropPath` TEXT, `rating` REAL, `releaseDate` TEXT, `overview` TEXT, `addedAt` INTEGER NOT NULL, `externalId` TEXT, `providerData` TEXT, PRIMARY KEY(`contentId`))");
        h1.l(aVar, "CREATE TABLE IF NOT EXISTS `history` (`contentId` TEXT NOT NULL, `contentType` TEXT NOT NULL, `title` TEXT NOT NULL, `posterPath` TEXT, `backdropPath` TEXT, `rating` REAL, `releaseDate` TEXT, `overview` TEXT, `watchedAt` INTEGER NOT NULL, `progress` INTEGER, `duration` INTEGER, `externalId` TEXT, `season` INTEGER, `episode` INTEGER, `episodeTitle` TEXT, PRIMARY KEY(`contentId`))");
        h1.l(aVar, "CREATE TABLE IF NOT EXISTS `downloads` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `url` TEXT NOT NULL, `fileName` TEXT NOT NULL, `title` TEXT NOT NULL, `contentType` TEXT NOT NULL, `contentId` TEXT, `posterPath` TEXT, `quality` TEXT, `size` TEXT, `status` TEXT NOT NULL, `progress` INTEGER NOT NULL, `downloadedBytes` INTEGER NOT NULL, `totalBytes` INTEGER NOT NULL, `filePath` TEXT, `headers` TEXT, `addedAt` INTEGER NOT NULL, `completedAt` INTEGER, `tmdbId` INTEGER NOT NULL, `season` INTEGER NOT NULL, `episode` INTEGER NOT NULL, `failureReason` TEXT)");
        h1.l(aVar, "CREATE TABLE IF NOT EXISTS `favourite_games` (`slug` TEXT NOT NULL, `platform` TEXT NOT NULL, `name` TEXT, `posterUrl` TEXT, `year` TEXT, `addedAt` INTEGER NOT NULL, PRIMARY KEY(`slug`))");
        h1.l(aVar, "CREATE TABLE IF NOT EXISTS `watch_progress` (`contentKey` TEXT NOT NULL, `positionMs` INTEGER NOT NULL, `durationMs` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL, PRIMARY KEY(`contentKey`))");
        h1.l(aVar, "CREATE TABLE IF NOT EXISTS `iptv_channels` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `url` TEXT NOT NULL, `logo` TEXT, `groupName` TEXT, `provider` TEXT NOT NULL, `tvgId` TEXT)");
        h1.l(aVar, "CREATE INDEX IF NOT EXISTS `index_iptv_channels_provider` ON `iptv_channels` (`provider`)");
        h1.l(aVar, "CREATE INDEX IF NOT EXISTS `index_iptv_channels_provider_groupName` ON `iptv_channels` (`provider`, `groupName`)");
        h1.l(aVar, "CREATE INDEX IF NOT EXISTS `index_iptv_channels_name` ON `iptv_channels` (`name`)");
        h1.l(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        h1.l(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6d8b217e013c2ca315f8e3487153e796')");
    }

    @Override // androidx.emoji2.text.g
    public final void e(androidx.sqlite.a aVar) {
        aVar.getClass();
        h1.l(aVar, "DROP TABLE IF EXISTS `watchlist`");
        h1.l(aVar, "DROP TABLE IF EXISTS `history`");
        h1.l(aVar, "DROP TABLE IF EXISTS `downloads`");
        h1.l(aVar, "DROP TABLE IF EXISTS `favourite_games`");
        h1.l(aVar, "DROP TABLE IF EXISTS `watch_progress`");
        h1.l(aVar, "DROP TABLE IF EXISTS `iptv_channels`");
    }

    @Override // androidx.emoji2.text.g
    public final void v(androidx.sqlite.a aVar) {
        aVar.getClass();
    }

    @Override // androidx.emoji2.text.g
    public final void w(androidx.sqlite.a aVar) {
        aVar.getClass();
        f fVarD = this.d.d();
        i0 i0Var = fVarD.b;
        i0Var.getClass();
        androidx.sqlite.c cVarU = aVar.U("PRAGMA query_only");
        try {
            cVarU.Q();
            boolean zT = cVarU.t();
            i.c(cVarU, null);
            if (!zT) {
                h1.l(aVar, "PRAGMA temp_store = MEMORY");
                h1.l(aVar, "PRAGMA recursive_triggers = 1");
                h1.l(aVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (i0Var.d) {
                    h1.l(aVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    h1.l(aVar, r.M("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false));
                }
                j jVar = i0Var.h;
                ReentrantLock reentrantLock = jVar.a;
                reentrantLock.lock();
                try {
                    jVar.d = true;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            synchronized (fVarD.g) {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i.c(cVarU, th2);
                throw th3;
            }
        }
    }

    @Override // androidx.emoji2.text.g
    public final void x(androidx.sqlite.a aVar) {
        aVar.getClass();
    }

    @Override // androidx.emoji2.text.g
    public final void y(androidx.sqlite.a aVar) {
        aVar.getClass();
        kotlin.collections.builders.b bVarH = com.google.common.base.c.h();
        androidx.sqlite.c cVarU = aVar.U("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cVarU.Q()) {
            try {
                bVarH.add(cVarU.F(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    i.c(cVarU, th);
                    throw th2;
                }
            }
        }
        i.c(cVarU, null);
        ListIterator listIterator = com.google.common.base.c.c(bVarH).listIterator(0);
        while (true) {
            u uVar = (u) listIterator;
            if (!uVar.hasNext()) {
                return;
            }
            String str = (String) uVar.next();
            if (r.O(str, "room_fts_content_sync_", false)) {
                h1.l(aVar, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    @Override // androidx.emoji2.text.g
    public final t z(androidx.sqlite.a aVar) {
        aVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("contentId", new androidx.room.util.f(1, 1, "contentId", "TEXT", null, true));
        linkedHashMap.put("contentType", new androidx.room.util.f(0, 1, "contentType", "TEXT", null, true));
        linkedHashMap.put("title", new androidx.room.util.f(0, 1, "title", "TEXT", null, true));
        linkedHashMap.put("posterPath", new androidx.room.util.f(0, 1, "posterPath", "TEXT", null, false));
        linkedHashMap.put("backdropPath", new androidx.room.util.f(0, 1, "backdropPath", "TEXT", null, false));
        linkedHashMap.put("rating", new androidx.room.util.f(0, 1, "rating", "REAL", null, false));
        linkedHashMap.put("releaseDate", new androidx.room.util.f(0, 1, "releaseDate", "TEXT", null, false));
        linkedHashMap.put("overview", new androidx.room.util.f(0, 1, "overview", "TEXT", null, false));
        linkedHashMap.put("addedAt", new androidx.room.util.f(0, 1, "addedAt", "INTEGER", null, true));
        linkedHashMap.put("externalId", new androidx.room.util.f(0, 1, "externalId", "TEXT", null, false));
        linkedHashMap.put("providerData", new androidx.room.util.f(0, 1, "providerData", "TEXT", null, false));
        androidx.room.util.i iVar = new androidx.room.util.i("watchlist", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        androidx.room.util.i iVarL = n.L(aVar, "watchlist");
        if (!iVar.equals(iVarL)) {
            return new t("watchlist(com.app.mlounge.data.local.entity.WatchlistEntity).\n Expected:\n" + iVar + "\n Found:\n" + iVarL, false);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("contentId", new androidx.room.util.f(1, 1, "contentId", "TEXT", null, true));
        linkedHashMap2.put("contentType", new androidx.room.util.f(0, 1, "contentType", "TEXT", null, true));
        linkedHashMap2.put("title", new androidx.room.util.f(0, 1, "title", "TEXT", null, true));
        linkedHashMap2.put("posterPath", new androidx.room.util.f(0, 1, "posterPath", "TEXT", null, false));
        linkedHashMap2.put("backdropPath", new androidx.room.util.f(0, 1, "backdropPath", "TEXT", null, false));
        linkedHashMap2.put("rating", new androidx.room.util.f(0, 1, "rating", "REAL", null, false));
        linkedHashMap2.put("releaseDate", new androidx.room.util.f(0, 1, "releaseDate", "TEXT", null, false));
        linkedHashMap2.put("overview", new androidx.room.util.f(0, 1, "overview", "TEXT", null, false));
        linkedHashMap2.put("watchedAt", new androidx.room.util.f(0, 1, "watchedAt", "INTEGER", null, true));
        linkedHashMap2.put("progress", new androidx.room.util.f(0, 1, "progress", "INTEGER", null, false));
        linkedHashMap2.put("duration", new androidx.room.util.f(0, 1, "duration", "INTEGER", null, false));
        linkedHashMap2.put("externalId", new androidx.room.util.f(0, 1, "externalId", "TEXT", null, false));
        linkedHashMap2.put("season", new androidx.room.util.f(0, 1, "season", "INTEGER", null, false));
        linkedHashMap2.put("episode", new androidx.room.util.f(0, 1, "episode", "INTEGER", null, false));
        linkedHashMap2.put("episodeTitle", new androidx.room.util.f(0, 1, "episodeTitle", "TEXT", null, false));
        androidx.room.util.i iVar2 = new androidx.room.util.i("history", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
        androidx.room.util.i iVarL2 = n.L(aVar, "history");
        if (!iVar2.equals(iVarL2)) {
            return new t("history(com.app.mlounge.data.local.entity.HistoryEntity).\n Expected:\n" + iVar2 + "\n Found:\n" + iVarL2, false);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("id", new androidx.room.util.f(1, 1, "id", "INTEGER", null, true));
        linkedHashMap3.put("url", new androidx.room.util.f(0, 1, "url", "TEXT", null, true));
        linkedHashMap3.put("fileName", new androidx.room.util.f(0, 1, "fileName", "TEXT", null, true));
        linkedHashMap3.put("title", new androidx.room.util.f(0, 1, "title", "TEXT", null, true));
        linkedHashMap3.put("contentType", new androidx.room.util.f(0, 1, "contentType", "TEXT", null, true));
        linkedHashMap3.put("contentId", new androidx.room.util.f(0, 1, "contentId", "TEXT", null, false));
        linkedHashMap3.put("posterPath", new androidx.room.util.f(0, 1, "posterPath", "TEXT", null, false));
        linkedHashMap3.put("quality", new androidx.room.util.f(0, 1, "quality", "TEXT", null, false));
        linkedHashMap3.put("size", new androidx.room.util.f(0, 1, "size", "TEXT", null, false));
        linkedHashMap3.put("status", new androidx.room.util.f(0, 1, "status", "TEXT", null, true));
        linkedHashMap3.put("progress", new androidx.room.util.f(0, 1, "progress", "INTEGER", null, true));
        linkedHashMap3.put("downloadedBytes", new androidx.room.util.f(0, 1, "downloadedBytes", "INTEGER", null, true));
        linkedHashMap3.put("totalBytes", new androidx.room.util.f(0, 1, "totalBytes", "INTEGER", null, true));
        linkedHashMap3.put("filePath", new androidx.room.util.f(0, 1, "filePath", "TEXT", null, false));
        linkedHashMap3.put("headers", new androidx.room.util.f(0, 1, "headers", "TEXT", null, false));
        linkedHashMap3.put("addedAt", new androidx.room.util.f(0, 1, "addedAt", "INTEGER", null, true));
        linkedHashMap3.put("completedAt", new androidx.room.util.f(0, 1, "completedAt", "INTEGER", null, false));
        linkedHashMap3.put("tmdbId", new androidx.room.util.f(0, 1, "tmdbId", "INTEGER", null, true));
        linkedHashMap3.put("season", new androidx.room.util.f(0, 1, "season", "INTEGER", null, true));
        linkedHashMap3.put("episode", new androidx.room.util.f(0, 1, "episode", "INTEGER", null, true));
        linkedHashMap3.put("failureReason", new androidx.room.util.f(0, 1, "failureReason", "TEXT", null, false));
        androidx.room.util.i iVar3 = new androidx.room.util.i("downloads", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
        androidx.room.util.i iVarL3 = n.L(aVar, "downloads");
        if (!iVar3.equals(iVarL3)) {
            return new t("downloads(com.app.mlounge.data.local.entity.DownloadEntity).\n Expected:\n" + iVar3 + "\n Found:\n" + iVarL3, false);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("slug", new androidx.room.util.f(1, 1, "slug", "TEXT", null, true));
        linkedHashMap4.put("platform", new androidx.room.util.f(0, 1, "platform", "TEXT", null, true));
        linkedHashMap4.put("name", new androidx.room.util.f(0, 1, "name", "TEXT", null, false));
        linkedHashMap4.put("posterUrl", new androidx.room.util.f(0, 1, "posterUrl", "TEXT", null, false));
        linkedHashMap4.put("year", new androidx.room.util.f(0, 1, "year", "TEXT", null, false));
        linkedHashMap4.put("addedAt", new androidx.room.util.f(0, 1, "addedAt", "INTEGER", null, true));
        androidx.room.util.i iVar4 = new androidx.room.util.i("favourite_games", linkedHashMap4, new LinkedHashSet(), new LinkedHashSet());
        androidx.room.util.i iVarL4 = n.L(aVar, "favourite_games");
        if (!iVar4.equals(iVarL4)) {
            return new t("favourite_games(com.app.mlounge.data.local.entity.FavouriteGameEntity).\n Expected:\n" + iVar4 + "\n Found:\n" + iVarL4, false);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("contentKey", new androidx.room.util.f(1, 1, "contentKey", "TEXT", null, true));
        linkedHashMap5.put("positionMs", new androidx.room.util.f(0, 1, "positionMs", "INTEGER", null, true));
        linkedHashMap5.put("durationMs", new androidx.room.util.f(0, 1, "durationMs", "INTEGER", null, true));
        linkedHashMap5.put("updatedAt", new androidx.room.util.f(0, 1, "updatedAt", "INTEGER", null, true));
        androidx.room.util.i iVar5 = new androidx.room.util.i("watch_progress", linkedHashMap5, new LinkedHashSet(), new LinkedHashSet());
        androidx.room.util.i iVarL5 = n.L(aVar, "watch_progress");
        if (!iVar5.equals(iVarL5)) {
            return new t("watch_progress(com.app.mlounge.data.local.entity.WatchProgressEntity).\n Expected:\n" + iVar5 + "\n Found:\n" + iVarL5, false);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("id", new androidx.room.util.f(1, 1, "id", "INTEGER", null, true));
        linkedHashMap6.put("name", new androidx.room.util.f(0, 1, "name", "TEXT", null, true));
        linkedHashMap6.put("url", new androidx.room.util.f(0, 1, "url", "TEXT", null, true));
        linkedHashMap6.put("logo", new androidx.room.util.f(0, 1, "logo", "TEXT", null, false));
        linkedHashMap6.put("groupName", new androidx.room.util.f(0, 1, "groupName", "TEXT", null, false));
        linkedHashMap6.put("provider", new androidx.room.util.f(0, 1, "provider", "TEXT", null, true));
        linkedHashMap6.put("tvgId", new androidx.room.util.f(0, 1, "tvgId", "TEXT", null, false));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new h("index_iptv_channels_provider", com.google.common.base.c.p("provider"), com.google.common.base.c.p("ASC"), false));
        linkedHashSet2.add(new h("index_iptv_channels_provider_groupName", com.google.common.base.c.q("provider", "groupName"), com.google.common.base.c.q("ASC", "ASC"), false));
        linkedHashSet2.add(new h("index_iptv_channels_name", com.google.common.base.c.p("name"), com.google.common.base.c.p("ASC"), false));
        androidx.room.util.i iVar6 = new androidx.room.util.i("iptv_channels", linkedHashMap6, linkedHashSet, linkedHashSet2);
        androidx.room.util.i iVarL6 = n.L(aVar, "iptv_channels");
        if (iVar6.equals(iVarL6)) {
            return new t(null, true);
        }
        return new t("iptv_channels(com.app.mlounge.data.local.entity.IptvChannelEntity).\n Expected:\n" + iVar6 + "\n Found:\n" + iVarL6, false);
    }
}
