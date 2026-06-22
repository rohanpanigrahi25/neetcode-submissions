class Solution:

    def encode(self, strs: List[str]) -> str:
        enStr = ""
        for s in strs:
            enStr += str(len(s)) + "#" + s
        return enStr

    def decode(self, s: str) -> List[str]:
        deStr = []
        i = 0
        while i < len(s):
            j = i 
            while s[j] != '#':
                j += 1
            length = int(s[i:j])
            i = j + 1
            j = i + length
            deStr.append(s[i:j])
            i = j
        
        return deStr
