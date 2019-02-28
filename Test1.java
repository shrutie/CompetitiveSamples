package p1;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="1.2wW6.2b34";
		st=st.replace(".", "0");
		int[] players= new int[12];
		int j=1;
		int team_score=0;
		int over_count=0;
		for (int i = 0; i < st.length(); i++,over_count++) {
			
			//System.out.println("i is: " + i);
			if(over_count%6==0){
				j=1;
				System.out.println("OVER");
			}
			if(st.charAt(i) != 'w' && st.charAt(i) != ' ' && st.charAt(i) != 'W' 
				&&st.charAt(i) != 'b'){
				System.out.println("Which player? : "+j);
				players[j]= players[j] + Integer.parseInt(String.valueOf(st.charAt(i)));
				System.out.println("Team score inc by players "+ j +" score"+ players[j]);
				team_score+=players[j];
				if(players[j]%2 !=0) j++;
				System.out.println("PlaYER IN ACTION NOW: " + j +" with runs: "+ players[j]);
				
			}
			else if(st.charAt(i)== 'W'){
				j++;
				System.out.println("OUT! Next player" +j + "at" +i);
			}
			else if(st.charAt(i) == 'w' 
				|| st.charAt(i) == 'b'){
				if(st.charAt(i)=='b') j++;
				if(st.charAt(i)=='w'){
					System.out.println("NO BALL" + "current ball " + over_count);
					over_count--;}
				System.out.println("team score inc by 1, bye");
				team_score+=1;
				
				if(players[j]%2 !=0) j++;
			}
		}
		System.out.println(team_score);
		//for(int i=0;i<players.length;i++) System.out.println(players[i]);
	}

}
