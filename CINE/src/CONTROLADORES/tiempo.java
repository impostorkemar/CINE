package CONTROLADORES;

public class tiempo {
	public tiempo()throws InterruptedException{
		int horas=0; int minutos=0; int segundos = 1;
		while(!(horas==0 && minutos==0 && segundos==0)) {
			if(horas<10) {
				System.out.print("0"+horas);
			}else {
				System.out.print(horas);
			}
			System.out.print(":");		

			if(minutos<10) {
				System.out.print("0"+minutos);
			}else {
				System.out.print(minutos);
			}
				System.out.print(":");
				if(segundos<10) {
					System.out.print("0"+segundos);
				}else {
					System.out.print(segundos);
				}
					System.out.println("");
				if(segundos == 0) {
					if(minutos == 0) {
						horas--;
						minutos=59;
						segundos=59;
					}else if(minutos !=0) {
						minutos--;
						segundos=59;
					}
				}else {
					segundos --;
				
				}
				Thread.sleep(1000);	
		}
	}
	
	

}
