package algoritmoMochila;

// Algoritmo obtenido del canal DiscoDurodeRoer: https://www.youtube.com/c/DiscoDurodeRoer
// Link del video: https://www.youtube.com/watch?v=S0uc0LGJu-M
// Link del algoritmo: https://github.com/DiscoDurodeRoer/ejercicios-java-youtube/tree/master/recursividad/recursividad%2012

public class Ejercicio {

	/*
	 * Enunciado: Queremos meter elementos en una mochila con un peso máximo, estos
	 * elementos tienen un peso y un beneficio. Obtener la mejor combinacion que mas
	 * beneficio nos dé y que no sobrepase el peso de la mochila.
	 */

	public static void main(String[] args) {

		// Elemento tiene como constructor peso y beneficio
		Elemento[] elementos0 = { new Elemento(1, 2), new Elemento(2, 3), new Elemento(3, 4), new Elemento(4, 5) };
		Elemento[] elementos1 = { new Elemento(1, 1), new Elemento(2, 2), new Elemento(4, 10), new Elemento(1, 2),
				new Elemento(12, 15) };

		Mochila m_base = new Mochila(15, elementos1.length); // Mochila base, irá cambiando respecto
																// a los cambios hechos
		Mochila m_opt = new Mochila(15, elementos1.length); // Mochila óptima, será la mejor de todas
															// las mochilas creadas y comparadas

		llenarMochila(m_base, elementos1, false, m_opt);

		System.out.println(m_opt);
	}

	public static void llenarMochila(Mochila m_base, Elemento[] elementos, boolean llena, Mochila m_opt) {

		// si está llena
		if (llena) {
			// comprueba si tiene más beneficio que otra
			if (m_base.getBeneficio() > m_opt.getBeneficio()) {

				Elemento[] elementosMochBase = m_base.getElementos();
				m_opt.clear();

				// metemos los elementos
				for (Elemento e : elementosMochBase) {
					if (e != null) {
						m_opt.aniadirElemento(e);
					}

				}

			}

		} else {
			// Recorre los elementos
			for (int i = 0; i < elementos.length; i++) {
				// si existe el elemento
				if (!m_base.existeElemento(elementos[i])) {
					// Si el peso de la mochila se supera, indica que está llena
					if (m_base.getPesoMaximo() > m_base.getPeso() + elementos[i].getPeso()) {
						m_base.aniadirElemento(elementos[i]); // añadimos
						llenarMochila(m_base, elementos, false, m_opt);
						m_base.eliminarElemento(elementos[i]); // lo elimina
					} else {
						llenarMochila(m_base, elementos, true, m_opt);
					}

				}

			}

		}

	}

}
