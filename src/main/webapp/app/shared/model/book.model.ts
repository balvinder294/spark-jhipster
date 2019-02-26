export interface IBook {
    id?: string;
    name?: string;
    author?: string;
    type?: string;
}

export class Book implements IBook {
    constructor(public id?: string, public name?: string, public author?: string, public type?: string) {}
}
