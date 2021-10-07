package de.apps.ctcq.tvcalendar.control;

import android.content.Context;

import androidx.room.Room;

import java.util.List;
import java.util.logging.Logger;

import de.apps.ctcq.tvcalendar.model.Database;
import de.apps.ctcq.tvcalendar.model.entity.TvShow;

public class TvShowCrudController {

    protected Database database;
    protected Logger logger;

    public TvShowCrudController(Context applicationContext) {
        this.logger = Logger.getLogger(this.getClass().getCanonicalName());
        this.database = Room.databaseBuilder(applicationContext, Database.class, "tv_cal")
                .build();
    }

    public void add(TvShow tvShow) {
        this.logger.info("Inserting TV Show " + tvShow);
        database.tvShowDao().insert(tvShow);
    }

    public List<TvShow> getAll() {
        this.logger.info("Getting all TV Shows");
        return database.tvShowDao().getAll();
    }

    public void remove(TvShow tvShow) {
        this.logger.info("Removing TV Show" + tvShow);
        database.tvShowDao().delete(tvShow);
    }
}
