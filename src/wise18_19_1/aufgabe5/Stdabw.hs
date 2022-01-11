module Stdabw where

import Data.List
import System.IO
  
schnitt :: [Double] -> Double
schnitt x = sum x / realToFrac(length x)

stdabw:: [Double] -> Double
stdabw x = sqrt (sum (map ((**2) . (-)(schnitt x)) x) / realToFrac(length x))
