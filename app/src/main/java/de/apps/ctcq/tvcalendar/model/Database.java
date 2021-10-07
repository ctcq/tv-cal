package de.apps.ctcq.tvcalendar.model;

import androidx.room.RoomDatabase;

import de.apps.ctcq.tvcalendar.model.dao.TvShowDao;
import de.apps.ctcq.tvcalendar.model.entity.TvShow;

@androidx.room.Database(entities = {TvShow.class}, version = 1)
public abstract class Database extends RoomDatabase {
    public abstract TvShowDao tvShowDao();

}
