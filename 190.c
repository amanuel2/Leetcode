//aa   bb  cc   dd
// a    b   c   d
// 10111001 01111000 00101001 01000000
// 00000000 00000000 00000000 00000000

uint32_t reverseBits(uint32_t n) {
    uint32_t bits[32]; //store each bit as a 32bit entry
    
    uint32_t bin = 1; //0b00000000000000000000000000000001
    for(int i=0; i<32;i++){
        bits[i] = (n&(bin<<i))>>i;
    }
    
    //at this point bits[] got all the bits needed
    uint32_t ans=0b0;
    for(int i=0; i<32;i++){
        bits[i] = (bits[i]<<(31-i));
        ans = (ans) | (bits[i]);    
    }
    
    return ans;
}