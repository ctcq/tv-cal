package de.apps.ctcq.tvcalendar.model.entity;

import java.util.List;

public class TvShowPage {

    protected Integer page;
    protected List<TvShow> result;
    protected Integer total_results;
    protected Integer total_pages;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public List<TvShow> getResults() {
        return result;
    }

    public void setResults(List<TvShow> results) {
        this.result = results;
    }

    public Integer getTotal_results() {
        return total_results;
    }

    public void setTotal_results(Integer total_results) {
        this.total_results = total_results;
    }

    public Integer getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(Integer total_pages) {
        this.total_pages = total_pages;
    }
}
