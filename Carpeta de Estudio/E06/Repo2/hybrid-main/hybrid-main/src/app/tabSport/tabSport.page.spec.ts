import { ComponentFixture, TestBed } from '@angular/core/testing';

import { tabSport } from './tabSport.page';

describe('tabSport', () => {
  let component: tabSport;
  let fixture: ComponentFixture<tabSport>;

  beforeEach(async () => {
    fixture = TestBed.createComponent(tabSport);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
