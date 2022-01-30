module Cosinus where

cosinus :: Double -> Double
cosinus x = sum (summanten x 0)

summanten :: Double -> Int -> [Double]
summanten x n = if (abs((-1)^n * (x^(2*n))/fromIntegral(fac 2*n)) > 0.001)
                then (-1)^n * (x^(2*n))/fromIntegral(fac 2*n) : summanten x (n+1)
                else []

fac :: Int -> Int
fac n = product [1..n]