package com.movile.next.seriestracker.database.dbFlow;

import android.provider.BaseColumns;

import com.movile.next.seriestracker.database.dbFlow.SeriesTrackerDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by movile on 04/07/15.
 */
@Table(databaseName = SeriesTrackerDatabase.NAME)
public class FavoriteEntity extends BaseModel {

    @Column(name = BaseColumns._ID)
    @PrimaryKey(autoincrement = true)
    Long id;

    @Column
    public String slug;

    @Column
    public String title;

    public String slug(){
        return slug;
    }

    public String title(){
        return title;
    }

}

