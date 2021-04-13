package com.example;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;


@Controller("/foo")
public class FooController {

    @Post("/bar")
    public HttpResponse bar(@Body String json) {
        System.out.println(json);

        return HttpResponse.ok();
    }
}
