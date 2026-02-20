//package chp10ex07;
//
//public class SelectionSort {
//	public void selectionSort(String[] names) {
//		String tmp;
//		int shortIndex;
//		
//		for(int i = 1; i < names.length; i++) {
//			for(int j = 0; j < i; j++) {
//				
//				if(names[j].length() < names[j + 1].length()) {
//					shortIndex = names[j].length();
//				}
//				else {
//					shortIndex = names[j + 1].length();
//				}
//				
//				for(int k = 0; k < shortIndex; k++) {
//				
//					if(names[j].charAt(k) > names[j + 1].charAt(k)) {
//					
//						tmp = names[j + 1];
//						names[j + 1] = names[i];
//						names[j] = tmp;
//					}
//				}
//			}
//		}
//	}
//}
