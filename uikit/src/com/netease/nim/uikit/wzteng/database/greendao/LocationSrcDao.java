package com.netease.nim.uikit.wzteng.database.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.netease.nim.uikit.wzteng.database.model.LocationSrc;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "LOCATION_SRC".
*/
public class LocationSrcDao extends AbstractDao<LocationSrc, Long> {

    public static final String TABLENAME = "LOCATION_SRC";

    /**
     * Properties of entity LocationSrc.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property SrcID = new Property(0, Long.class, "srcID", true, "_id");
        public final static Property AddrTxt = new Property(1, String.class, "addrTxt", false, "ADDR_TXT");
        public final static Property ImagePath = new Property(2, String.class, "imagePath", false, "IMAGE_PATH");
    }


    public LocationSrcDao(DaoConfig config) {
        super(config);
    }
    
    public LocationSrcDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"LOCATION_SRC\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: srcID
                "\"ADDR_TXT\" TEXT," + // 1: addrTxt
                "\"IMAGE_PATH\" TEXT);"); // 2: imagePath
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"LOCATION_SRC\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, LocationSrc entity) {
        stmt.clearBindings();
 
        Long srcID = entity.getSrcID();
        if (srcID != null) {
            stmt.bindLong(1, srcID);
        }
 
        String addrTxt = entity.getAddrTxt();
        if (addrTxt != null) {
            stmt.bindString(2, addrTxt);
        }
 
        String imagePath = entity.getImagePath();
        if (imagePath != null) {
            stmt.bindString(3, imagePath);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, LocationSrc entity) {
        stmt.clearBindings();
 
        Long srcID = entity.getSrcID();
        if (srcID != null) {
            stmt.bindLong(1, srcID);
        }
 
        String addrTxt = entity.getAddrTxt();
        if (addrTxt != null) {
            stmt.bindString(2, addrTxt);
        }
 
        String imagePath = entity.getImagePath();
        if (imagePath != null) {
            stmt.bindString(3, imagePath);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public LocationSrc readEntity(Cursor cursor, int offset) {
        LocationSrc entity = new LocationSrc( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // srcID
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // addrTxt
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // imagePath
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, LocationSrc entity, int offset) {
        entity.setSrcID(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setAddrTxt(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setImagePath(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(LocationSrc entity, long rowId) {
        entity.setSrcID(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(LocationSrc entity) {
        if(entity != null) {
            return entity.getSrcID();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(LocationSrc entity) {
        return entity.getSrcID() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
