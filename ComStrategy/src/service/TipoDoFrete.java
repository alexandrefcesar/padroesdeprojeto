package service;

import service.frete.Normal;
import service.frete.Sedex;


// colocar o padrão fabrica junto dos enum para criar os objetos
public enum TipoDoFrete {
	NORMAL {
		@Override
		public Frete obterFrete() {
			// TODO Auto-generated method stub
			return new Normal();
		}
	},
	SEDEX {
		@Override
		public Frete obterFrete() {
			// TODO Auto-generated method stub
			return new Sedex();
		}
	};

	public abstract Frete obterFrete();

}
