String.prototype.camelCase=function(){
    if (this.length === 0) {
        return "";
    }
    return this.split(" ").map(word => word[0].toUpperCase() + word.slice(1)).join("");
}