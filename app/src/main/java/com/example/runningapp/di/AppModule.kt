package com.example.runningapp.di

import android.content.Context
import androidx.room.Room
import com.example.runningapp.db.RunDB
import com.example.runningapp.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton


@Module
@InstallIn(ApplicationComponent::class)
object AppModule {


    @Provides
    @Singleton
    fun provideRunningDB(
        /** we will inject context to tell dagger from where will get context*/
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(
        app,
        RunDB::class.java,
        Constants.RUNNING_DB_NAME
    ).build()


    @Provides
    @Singleton
    fun provideRunDao(db: RunDB) = db.getRunDao()
}