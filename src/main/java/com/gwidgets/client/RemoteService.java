package com.gwidgets.client;

import com.gwidgets.client.dto.Currency;
import com.gwidgets.client.dto.Expense;
import com.intendia.gwt.autorest.client.AutoRestGwt;
import io.reactivex.Observable;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@AutoRestGwt @Path("v1")
public interface RemoteService {
    @GET Observable<Currency> currencies();
    @GET Observable<Expense> expenses();
}
