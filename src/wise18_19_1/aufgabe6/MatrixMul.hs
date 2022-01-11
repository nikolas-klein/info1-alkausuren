module MatrixMul where

    
  matmul :: [[Int]] -> [[Int]] -> [[Int]]
  matmul x y = [[ sum $ zipWith (*) ar bc | bc <- (trans y)] | ar <- x ]
  
  trans :: [[Int]] -> [[Int]]
  trans ([]:_) = []
  trans x = map head x : trans (map tail x)