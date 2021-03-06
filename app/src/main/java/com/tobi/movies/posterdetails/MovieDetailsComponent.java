package com.tobi.movies.posterdetails;

import com.tobi.movies.ApplicationComponent;
import com.tobi.movies.di.ActivityScope;
import com.tobi.movies.misc.ImageModule;
import com.tobi.movies.misc.ThreadingModule;

import dagger.Component;

@ActivityScope
@Component(
        modules = {
                DetailsConverterModule.class,
                DetailsApiModule.class,
                ImageModule.class,
                ThreadingModule.class
        },
        dependencies = ApplicationComponent.class
)
public interface MovieDetailsComponent {
    void inject(MovieDetailsActivity movieDetailsActivity);
}
