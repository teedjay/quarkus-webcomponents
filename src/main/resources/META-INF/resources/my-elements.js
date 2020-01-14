import { LitElement, html, css } from 'https://unpkg.com/lit-element@latest/lit-element.js?module';

class MyElement extends LitElement {

    static get properties() {
        return {
            prop1: { type: String },
            prop2: { type: Number },
            prop3: { type: Boolean },
        };
    }

    static get styles() {
        return css`.mood { color: green; background-color: yellow; font-size: 2em; }`;
    }

    constructor() {
        super();
        this.prop1 = 'Hello World';
        this.prop2 = 100;
        this.prop3 = false;
    }

    render() {
        return html`
          <style>@import "/webjars/bootstrap/4.4.1/css/bootstrap.min.css";</style>
          <span class="mood">All properties</span>
          <p>prop1: ${this.prop1}</p>
          <p>prop2: ${this.prop2}</p>
          <p>prop3: ${this.prop3}</p>
          <button type="button" class="btn btn-primary" @click="${this.changeProperties}">change properties</button>
        `;
    }

    changeProperties() {
        let randy = Math.floor(Math.random()*10);
        let myBool = this.prop3;
        this.prop1 = randy.toString();
        this.prop2 = randy;
        this.prop3 = !myBool;
    }

    /*
    updated(changedProperties) {
        changedProperties.forEach((oldValue, propName) => {
            console.log(`${propName} changed. oldValue: ${oldValue}`);
        });
    }
    */

}

customElements.define('wc-element', MyElement);
