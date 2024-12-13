import { ComponentFixture, TestBed } from '@angular/core/testing';

import { scanner } from './scanner.page';

describe('scanner', () => {
  let component: scanner;
  let fixture: ComponentFixture<scanner>;

  beforeEach(async () => {
    fixture = TestBed.createComponent(scanner);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
