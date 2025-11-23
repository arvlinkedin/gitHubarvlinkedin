import { Directive } from '@angular/core';
import { AbstractControl, ValidationErrors, Validator, Validators } from '@angular/forms';

@Directive({
  selector: '[appTestDirective]'
})
export class TestDirectiveDirective implements Validator {

  constructor() { }

  validate(control: AbstractControl): ValidationErrors | null {
    const value = control.value;
    // Example validation: check if the value is not empty
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!value || !emailRegex.test(value)) {
      return { 'customEmailInValid' : { value : control.value} };
    } else {
      return null;
    }
    return value ? null : { required: true };
  }

  registerOnValidatorChange?(fn: () => void): void {
    // Implementation for notifying changes
  }
}
