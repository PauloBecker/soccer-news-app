package me.dio.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        //TODO Remover Mock de Notícias
        List<News> news = new ArrayList<>();
        news.add( new News( "Bec tem desfalque importante","Em partida válida pela 2ª Rodada do Campeonato Catarinense Série B" ) );
        news.add( new News( "Meninas jogam no sábado","Aguenta coração! Tá chegando a hora! A diretoria promoveu descontos bem bacanas em relação aos preços dos ingressos. " ) );
        news.add( new News( "Copa do mundo feminina está terminando", "A estréia do Blumenau na série B do campeonato catarinense teve sua data alterada: será no sábado, dia 28/05/22, no estádio Ervin Blaese (Arena Master), em Indaial." ) );

        this.news.setValue( news );
    }

    public LiveData<List<News>> getNews() {

        return news;
    }
}