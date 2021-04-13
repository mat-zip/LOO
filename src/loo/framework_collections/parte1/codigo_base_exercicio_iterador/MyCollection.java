package loo.framework_collections.parte1.codigo_base_exercicio_iterador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyCollection extends BaseCollection {

	@Override
	public Iterator<String> iterator() {
		return new MyIterator();
	}


	private class MyIterator implements Iterator<String>{
		public boolean hasNext(){
			return data.iterator().hasNext();
		}

		@Override
		public String next() {

			Object[] firstElement =  data.toArray();
			Object[] lastElement = data.toArray();

			//Adiciona os elementos de "firstElement" em ordem contrária
			for (int i = 0; i < lastElement.length; i++) {
				lastElement[i] = firstElement[firstElement.length - (i +1)];
			}

			//Se o número for par
			if (firstElement.length % 2 == 0){
				for (int i = 0; i < firstElement.length / 2; i++) {
					System.out.println("First element: " + firstElement[i]);
					System.out.println("Last element: " + lastElement[i]);
				}
			} else {
				for (int i = 0; i < (firstElement.length / 2) + 1; i++) {

					System.out.println("First element: " + firstElement[i]);
					if (firstElement[i] == lastElement[i]) {
						break;
					}
					System.out.println("Last element: " + lastElement[i]);
				}
			}

			return null;
		}

	}
}
