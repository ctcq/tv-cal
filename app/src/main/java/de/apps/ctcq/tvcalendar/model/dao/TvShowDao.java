package de.apps.ctcq.tvcalendar.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import de.apps.ctcq.tvcalendar.model.entity.TvShow;

@Dao
public interface TvShowDao {
    @Query("SELECT * FROM tvshow")
    List<TvShow> getAll();

    @Insert
    void insert(TvShow show);

    @Delete
    void delete(TvShow show);

}
