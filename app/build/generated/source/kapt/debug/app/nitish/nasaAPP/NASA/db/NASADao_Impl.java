package app.nitish.nasaAPP.NASA.db;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.concurrent.Callable;
import javax.annotation.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class NASADao_Impl implements NASADao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<NASAEntity> __insertionAdapterOfNASAEntity;

  private final EntityDeletionOrUpdateAdapter<NASAEntity> __deletionAdapterOfNASAEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public NASADao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNASAEntity = new EntityInsertionAdapter<NASAEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `NASAEntity` (`id`,`date`,`title`,`explanation`,`mediaType`,`url`,`hdurl`,`copyright`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NASAEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getDate() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDate());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getExplanation() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getExplanation());
        }
        if (value.getMediaType() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getMediaType());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getUrl());
        }
        if (value.getHdurl() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getHdurl());
        }
        if (value.getCopyright() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getCopyright());
        }
      }
    };
    this.__deletionAdapterOfNASAEntity = new EntityDeletionOrUpdateAdapter<NASAEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `NASAEntity` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NASAEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM NASAentity";
        return _query;
      }
    };
  }

  @Override
  public Object insertNASA(final NASAEntity NASAEntity, final Continuation<? super Long> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfNASAEntity.insertAndReturnId(NASAEntity);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final NASAEntity NASAEntity, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfNASAEntity.handle(NASAEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object loadByDate(final String date, final Continuation<? super NASAEntity> p1) {
    final String _sql = "SELECT * FROM NASAentity WHERE date LIKE ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (date == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, date);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<NASAEntity>() {
      @Override
      public NASAEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfExplanation = CursorUtil.getColumnIndexOrThrow(_cursor, "explanation");
          final int _cursorIndexOfMediaType = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaType");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfHdurl = CursorUtil.getColumnIndexOrThrow(_cursor, "hdurl");
          final int _cursorIndexOfCopyright = CursorUtil.getColumnIndexOrThrow(_cursor, "copyright");
          final NASAEntity _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpDate;
            _tmpDate = _cursor.getString(_cursorIndexOfDate);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpExplanation;
            _tmpExplanation = _cursor.getString(_cursorIndexOfExplanation);
            final String _tmpMediaType;
            _tmpMediaType = _cursor.getString(_cursorIndexOfMediaType);
            final String _tmpUrl;
            _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            final String _tmpHdurl;
            _tmpHdurl = _cursor.getString(_cursorIndexOfHdurl);
            final String _tmpCopyright;
            _tmpCopyright = _cursor.getString(_cursorIndexOfCopyright);
            _result = new NASAEntity(_tmpId,_tmpDate,_tmpTitle,_tmpExplanation,_tmpMediaType,_tmpUrl,_tmpHdurl,_tmpCopyright);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public Object loadById(final long id, final Continuation<? super NASAEntity> p1) {
    final String _sql = "SELECT * FROM NASAentity WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.execute(__db, false, new Callable<NASAEntity>() {
      @Override
      public NASAEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfExplanation = CursorUtil.getColumnIndexOrThrow(_cursor, "explanation");
          final int _cursorIndexOfMediaType = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaType");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfHdurl = CursorUtil.getColumnIndexOrThrow(_cursor, "hdurl");
          final int _cursorIndexOfCopyright = CursorUtil.getColumnIndexOrThrow(_cursor, "copyright");
          final NASAEntity _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpDate;
            _tmpDate = _cursor.getString(_cursorIndexOfDate);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpExplanation;
            _tmpExplanation = _cursor.getString(_cursorIndexOfExplanation);
            final String _tmpMediaType;
            _tmpMediaType = _cursor.getString(_cursorIndexOfMediaType);
            final String _tmpUrl;
            _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            final String _tmpHdurl;
            _tmpHdurl = _cursor.getString(_cursorIndexOfHdurl);
            final String _tmpCopyright;
            _tmpCopyright = _cursor.getString(_cursorIndexOfCopyright);
            _result = new NASAEntity(_tmpId,_tmpDate,_tmpTitle,_tmpExplanation,_tmpMediaType,_tmpUrl,_tmpHdurl,_tmpCopyright);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }
}
