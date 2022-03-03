package com.company.oo.exo.sport.equipe;

public interface EnEquipe<T extends EnEquipe<T>> {
	Equipe<T> getEquipe();
	void setEquipe(Equipe<T> equipe);
	int performer();
}
