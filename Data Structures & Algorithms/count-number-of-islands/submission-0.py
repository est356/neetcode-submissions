class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        if not grid:
            return 0
        
        row = len(grid)
        column = len(grid[0])
        visited = [[0 for c in range(column)] for r in range(row)]
        islands = 0
        directions = [[1,0],[0,1],[-1,0],[0,-1]]
        
        def bfs(bfsR: int, bfsC: int):
            q = collections.deque()
            visited[bfsR][bfsC] = 1
            q.append((bfsR, bfsC))

            while q:
                r, c = q.popleft()
                for dr, dc in directions:
                    nr, nc = r+dr, c+dc
                    if (nr in range(row) 
                        and nc in range(column) 
                        and visited[nr][nc] == 0 
                        and grid[nr][nc] == "1"):
                        visited[nr][nc] = 1
                        q.append((nr,nc))

        for r in range(row):
            for c in range(column):
                if grid[r][c] == "1" and visited[r][c] == 0:
                    bfs(r, c)
                    islands += 1

        return islands
