public void bFS(int src) {
		Queue<Integer> queue = new LinkedList<>(); 
		
		boolean[] visited = new boolean[matirx.length];
		
		queue.offer(src); // una add migliore
	
		visited[src] = true;
		
		while (queue.size()  != 0){
			
			src = queue.poll();
			
			System.out.println(nodes.get(src).toChar() + " = visited");
			
			for (int i = 0; i < matirx[src].length; i++) { 
				if (matirx[src][i] == 1 && !visited[i]) {
					queue.offer(i);
					visited[i] = true;
				}
			}
		}
	
	}
