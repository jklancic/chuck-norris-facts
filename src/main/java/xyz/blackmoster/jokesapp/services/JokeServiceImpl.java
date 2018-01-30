package xyz.blackmoster.jokesapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;

	public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}

	public String getRandomChuckNorrisFact() {
		return chuckNorrisQuotes.getRandomQuote();
	}
}
